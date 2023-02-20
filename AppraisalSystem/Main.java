package appraisalRating;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {

		loadingDetailsForRating();
		loginAndProcess();
	}

	public static void loadingDetailsForRating() {

		Employee employee1 = new Employee(1, "ABC", "Manager", 1);
		Employee employee2 = new Employee(2, "XYZ", "Lead", 1);
		Employee employee3 = new Employee(3, "IJK", "Member", 2);
		Employee employee4 = new Employee(4, "LMN", "Member", 2);
		Employee employee5 = new Employee(5, "OPQ", "Member", 2);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

		Goals goal1 = new Goals("G1", "GoalOne", "Goal for Employee", 2, "Completed", true, 75);
		Goals goal2 = new Goals("G2", "GoalTwo", "Goal for Employee", 1, "Partially Completed", true, 25);
		Goals goal3 = new Goals("G3", "GoalThree", "Goal for Employee", 4, "Completed", false, 0);

		Assignments assignment1 = new Assignments("A1", "AssignmentOne", 2, "Java", "Completed", true, 100);
		Assignments assignment2 = new Assignments("A2", "AssignmentTwo", 4, "SQL", "Partially Completed", false, 0);

		Projects project1 = new Projects("P1", "ProjectOne", 2, "Completed", true, 50);
		Projects project2 = new Projects("P2", "ProjectTwo", 2, "Completed", true, 50);

		Employee.goalsMap.put(employee1.getEmployeeID(), goal1);
		Employee.goalsMap.put(employee1.getEmployeeID(), goal2);
		Employee.goalsMap.put(employee2.getEmployeeID(), goal3);
		Employee.goalsMap.put(employee3.getEmployeeID(), goal1);
		Employee.goalsMap.put(employee4.getEmployeeID(), goal2);
		Employee.goalsMap.put(employee5.getEmployeeID(), goal3);

		Employee.assignmentsMap.put(employee1.getEmployeeID(), assignment1);
		Employee.assignmentsMap.put(employee2.getEmployeeID(), assignment2);
		Employee.assignmentsMap.put(employee3.getEmployeeID(), assignment1);
		Employee.assignmentsMap.put(employee4.getEmployeeID(), assignment2);
		Employee.assignmentsMap.put(employee5.getEmployeeID(), assignment2);

		Employee.projectsMap.put(employee1.getEmployeeID(), project1);
		Employee.projectsMap.put(employee2.getEmployeeID(), project2);
		Employee.projectsMap.put(employee3.getEmployeeID(), project1);
		Employee.projectsMap.put(employee4.getEmployeeID(), project2);
		Employee.projectsMap.put(employee5.getEmployeeID(), project1);
	}

	public static void loginAndProcess() {

		System.out.println("Appraisal System");
		System.out.println("Enter you Employee ID");
		int employeeID = scan.nextInt();

		for (Employee employeeEachValue : employeeList)
			if (employeeEachValue.getEmployeeID() == employeeID) {
				System.out.println("Enter \"P\" for Peer-to-peer rating");
				System.out.println("Enter \"S\" for Self rating");
				String ratingType = scan.next();

				if (ratingType.equalsIgnoreCase("P")) {
					System.out.println("\nPeer-to-Peer Rating");
					if (viewEmployees(employeeEachValue.getEmployeeID())) {
						System.out.println("\nEnter the employee ID to give rating for ");
						int employeeIDForRating = scan.nextInt();
						foRating(employeeIDForRating);
					} else {
						System.out.println("No reportee to rate.Logging out");
						loginAndProcess();
					}
				} else if (ratingType.equalsIgnoreCase("S")) {
					foRating(employeeID);
				}
			}
	}

	private static void foRating(int employeeIDForRating) {
		double goalModuleTotalAvg, assignmentModuleTotalAvg, projectModuleTotalAvg, finalScore;
		int moduleCount = 0;
		goalModuleTotalAvg = displayAndRateGoals(employeeIDForRating);
		if (goalModuleTotalAvg > 0) {
			moduleCount++;
		}
		System.out.format("\nTotal Goal Average : %.2f", goalModuleTotalAvg);
		System.out.println();

		assignmentModuleTotalAvg = displayAndRateAssignments(employeeIDForRating);
		if (assignmentModuleTotalAvg > 0) {
			moduleCount++;
		}
		System.out.format("\nTotal Assignment Average : %.2f", assignmentModuleTotalAvg);
		System.out.println();

		projectModuleTotalAvg = displayAndRateProjects(employeeIDForRating);
		if (projectModuleTotalAvg > 0) {
			moduleCount++;
		}
		System.out.format("\nTotal Project Average : %.2f", projectModuleTotalAvg);
		System.out.println();

		double goalActualScore = CalculationMethodsForRating.actualScoreOfAModule(goalModuleTotalAvg, moduleCount);
		double assignmentActualScore = CalculationMethodsForRating.actualScoreOfAModule(assignmentModuleTotalAvg,
				moduleCount);
		double projectsActualScore = CalculationMethodsForRating.actualScoreOfAModule(projectModuleTotalAvg,
				moduleCount);
		System.out.println("Actual score of Goals " + String.format("%.2f", goalActualScore));
		System.out.println("Actual score of Assignments " + String.format("%.2f", assignmentActualScore));
		System.out.println("Actual score of Projects " + String.format("%.2f", projectsActualScore));
		finalScore = goalActualScore + assignmentActualScore + projectsActualScore;
		System.out.println("Final score is " + String.format("%.2f", finalScore));
		System.out.println(CalculationMethodsForRating.displayFinalRating(finalScore));

	}

	private static boolean viewEmployees(int employeeID) {
		boolean displayReportee = false;
		System.out.println("\nThe Employees Details");
		System.out.println("EmployeeID\tEmployeeName\tDesignation\tReportingAuthorityID");
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getEmployeeID() > employeeID) {
				System.out.println(employeeList.get(i).getEmployeeID() + "\t\t" + employeeList.get(i).getEmployeeName()
						+ "\t\t" + employeeList.get(i).getEmployeeDesignation() + "\t\t\t"
						+ employeeList.get(i).getReportingAuthorityID());
				displayReportee = true;
			}
		}
		return displayReportee;
	}

	private static double displayAndRateGoals(int employeeIDForRating) {
		int rating = 0, sumOfRating = 0, sumOfDenominator = 0;
		System.out.println("\n\nGoals for " + employeeIDForRating);
		System.out.println("GoalID\tGoalName\t\tGoalDescription\t  GoalDuration\tGoalStatus");
		for (Entry<Integer, Goals> eachGoal : Employee.goalsMap.entrySet()) {
			if (eachGoal.getKey() == employeeIDForRating) {
				System.out.println(eachGoal.getValue().getGoalID() + "\t" + eachGoal.getValue().getGoalName() + "\t\t"
						+ eachGoal.getValue().getGoalDescription() + "\t" + eachGoal.getValue().getGoalDuration() + "\t"
						+ eachGoal.getValue().getGoalStatus());
				System.out.println("\nEnter the Goal Rating : 1-5");
				rating = scan.nextInt();
				if (eachGoal.getValue().isGoalEnableWeightage()) {
					sumOfRating += rating * eachGoal.getValue().getGoalWeightage();
					sumOfDenominator += eachGoal.getValue().getGoalWeightage();
				} else {
					sumOfRating += rating;
					sumOfDenominator++;
				}
			}
		}

		return CalculationMethodsForRating.moduleTotalAverage(sumOfRating, sumOfDenominator);

	}

	private static double displayAndRateAssignments(int employeeIDForRating) {
		int rating = 0, sumOfRating = 0, sumOfDenominator = 0;
		System.out.println("\n\nAssignments for " + employeeIDForRating);
		System.out.println("AssignmentID\tAssignmentName\tAssignmentTopic\tAssignmentDuration\tAssignmentStatus");
		for (Entry<Integer, Assignments> eachAssignment : Employee.assignmentsMap.entrySet()) {
			if (eachAssignment.getKey() == employeeIDForRating) {
				System.out.println(eachAssignment.getValue().getAssignmentID() + "\t\t"
						+ eachAssignment.getValue().getAssignmentName() + "\t"
						+ eachAssignment.getValue().getAssignmentTopic() + "\t\t"
						+ eachAssignment.getValue().getAssignmentDuration() + "\t\t"
						+ eachAssignment.getValue().getAssignmentStatus());

				System.out.println("\nEnter the Assignment Rating : 1-5");
				rating = scan.nextInt();
				if (eachAssignment.getValue().isAssignmentEnableWeightage()) {
					sumOfRating += rating * eachAssignment.getValue().getAssignmentWeightage();
					sumOfDenominator += eachAssignment.getValue().getAssignmentWeightage();
				} else {
					sumOfRating += rating;
					sumOfDenominator++;
				}
			}
		}

		return CalculationMethodsForRating.moduleTotalAverage(sumOfRating, sumOfDenominator);

	}

	private static double displayAndRateProjects(int employeeIDForRating) {
		int rating = 0, sumOfRating = 0, sumOfDenominator = 0;
		System.out.println("\n\nProjects for " + employeeIDForRating);
		System.out.println("ProjectID\tProjectName\tProjectDuration\tProjectStatus");
		for (Entry<Integer, Projects> eachProject : Employee.projectsMap.entrySet()) {
			if (eachProject.getKey() == employeeIDForRating) {
				System.out.println(eachProject.getValue().getProjectID() + "\t"
						+ eachProject.getValue().getProjectName() + "\t\t" + eachProject.getValue().getProjectDuration()
						+ "\t\t" + eachProject.getValue().getProjectStatus());

				System.out.println("Enter the Project Rating : 1-5");
				rating = scan.nextInt();
				if (eachProject.getValue().isProjectEnableWeightage()) {
					sumOfRating += rating * eachProject.getValue().getProjectWeightage();
					sumOfDenominator += eachProject.getValue().getProjectWeightage();
				} else {
					sumOfRating += rating;
					sumOfDenominator++;
				}
			}
		}

		return CalculationMethodsForRating.moduleTotalAverage(sumOfRating, sumOfDenominator);

	}
}
