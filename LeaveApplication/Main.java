package leaveTracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	static HashMap<Integer, String> calendarStartDay = new HashMap<Integer, String>();

	static LeaveDetails casualLeave = new LeaveDetails("CL", "Casual Leave");
	static LeaveDetails sickLeave = new LeaveDetails("SL", "Sick Leave");

	public static void main(String[] args) {
		lodingDetails();
		loginStart();
	}

	private static void lodingDetails() {

		Employee employee1 = new Employee(1, "xyz", "Admin");
		Employee employee2 = new Employee(2, "abc", "TeamMember");
		Employee employee3 = new Employee(3, "opq", "TeamMember");
		Employee employee4 = new Employee(4, "ghi", "TeamMember");
		Employee employee5 = new Employee(5, "lmn", "TeamMember");

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

		employee1.leaveForEmployee.put(sickLeave, 20);
		employee1.leaveForEmployee.put(casualLeave, 15);

		employee2.leaveForEmployee.put(sickLeave, 20);
		employee2.leaveForEmployee.put(casualLeave, 15);

		employee3.leaveForEmployee.put(sickLeave, 20);
		employee3.leaveForEmployee.put(casualLeave, 15);

		employee4.leaveForEmployee.put(sickLeave, 20);
		employee4.leaveForEmployee.put(casualLeave, 15);

		employee5.leaveForEmployee.put(sickLeave, 20);
		employee5.leaveForEmployee.put(casualLeave, 15);

		calendarStartDay.put(1, "Sunday");
		calendarStartDay.put(2, "Wednesday");
		calendarStartDay.put(3, "Wednesday");
		calendarStartDay.put(4, "Saturday");
		calendarStartDay.put(5, "Monday");
		calendarStartDay.put(6, "Thursday");
		calendarStartDay.put(7, "Saturday");
		calendarStartDay.put(8, "Tuesday");
		calendarStartDay.put(9, "Friday");
		calendarStartDay.put(10, "Sunday");
		calendarStartDay.put(11, "Wednesday");
		calendarStartDay.put(12, "Friday");

	}

	private static void loginStart() {
		boolean performOperation = true;
		boolean validEmployee = false;

		do {
			System.out.println("LeaveTracking System");
			System.out.println("Enter your Employee ID or enter 0 for exit");
			int employeeVerify = scan.nextInt();
			if (employeeVerify == 0) {
				System.exit(0);
			}

			for (Employee eachEmployee : employeeList) {
				if (employeeVerify == eachEmployee.getEmployeeID()) {
					validEmployee = true;
					if (eachEmployee.getEmployeeType().equals("Admin")) {
						System.out.println("Welcome Admin");
						adminOperations(eachEmployee);
					} else {
						System.out.println("Welcome TeamMember");
						teamMemberOperations(eachEmployee);
					}
				}
			}

			if (!validEmployee) {
				System.out.println("Enter a valid Employee ID");
				loginStart();
			}

		} while (performOperation);
	}

	private static void adminOperations(Employee eachEmployee) {
		Employee toCallTheMethods = new Employee();
		boolean isValidID = false;

		System.out.println("Admin Operations");
		System.out.println("Enter \"Add\" to add leave balances");
		System.out.println("Enter \"Apply\" to apply for leave");
		System.out.println("Enter \"Cancel\" to cancel the applied leave");

		String adminInput = scan.next().toLowerCase();

		toCallTheMethods.viewLeaveBalance(eachEmployee);
		System.out.println("Enter the Employee ID");
		int employeeIDForManipulation = scan.nextInt();
		for (Employee eachValue : employeeList) {
			if (employeeIDForManipulation == eachValue.getEmployeeID()) {

				switch (adminInput) {
				case "add":

					boolean isAdded = addLeaveBalance(eachValue);
					System.out.println(isAdded ? "Added successfully" : "Not Added");
					break;

				case "apply":
					boolean isApplied = applyLeave(eachValue);
					System.out.println(isApplied ? "Applied successfully" : "Not Applied");
					break;

				case "cancel":
					boolean isCancelled = cancelLeave(eachValue);
					System.out.println(isCancelled ? "Cancelled successfully" : "Not Cancelled");
					break;
				}
			}

		}

		if (!isValidID) {
			System.out.println("Enter a valid id");
		}
	}

	protected static boolean addLeaveBalance(Employee addLeaveEmployee) {
		boolean isAdded = false;
		System.out.println("Enter the type of leave \"SL\" or \"CL\" ");
		String typeOfLeave = scan.next().toUpperCase();
		System.out.println("Enter the days count");
		int updateCount = scan.nextInt();
		if (typeOfLeave.equals("CL")) {
			addLeaveEmployee.leaveForEmployee.put(casualLeave, updateCount);
			isAdded = true;
		} else if (typeOfLeave.equals("SL")) {
			addLeaveEmployee.leaveForEmployee.put(sickLeave, updateCount);
			isAdded = true;

		} else {
			System.out.println("Enter a valid leave type.");
		}

		return isAdded;
	}

	private static void teamMemberOperations(Employee eachEmployee) {
		// TODO Auto-generated method stub

	}

	private static boolean applyLeave(Employee applyLeaveEmployee) {
		boolean isApplied=false;
		System.out.println("Enter the type of leave \"SL\" or \"CL\" ");
		String typeOfLeave = scan.next().toUpperCase();
		
		
		return isApplied;
	}

	private static boolean cancelLeave(Employee eachValue) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int checkWeekend(int day, int month) {
		int value = 0;
		for (Entry<Integer, String> check : calendarStartDay.entrySet()) {

		}

		return value;
	}

}
