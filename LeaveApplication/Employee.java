package leaveTracker;

import java.util.HashMap;
import java.util.Map.Entry;

public class Employee {
	private int employeeID;
	private String employeeName;
	private String employeeType;
	private int availableLeaveBalance;

	HashMap<LeaveDetails, Integer> leaveForEmployee = new HashMap<LeaveDetails, Integer>();

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public int getAvailableLeaveBalance() {
		return availableLeaveBalance;
	}

	public void setAvailableLeaveBalance(int availableLeaveBalance) {
		this.availableLeaveBalance = availableLeaveBalance;
	}

	public Employee(int employeeID, String employeeName, String employeeType) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	protected void viewLeaveBalance(Employee eachEmployee) {

		System.out.println("Employee Leave Details");
		if (eachEmployee.getEmployeeType().equals("Admin")) {
			for (Employee eachValue : Main.employeeList) {
				System.out.print(eachValue.getEmployeeID() + "\t" + eachValue.getEmployeeName() + "\t"
						+ eachValue.getEmployeeType() + "\t");
				for (Entry<LeaveDetails, Integer> eachEntry : eachValue.leaveForEmployee.entrySet()) {
					System.out.println(eachEntry.getKey().getLeaveID() + "\t" + eachEntry.getKey().getLeaveType() + "\t"
							+ eachEntry.getValue());
				}
			}

		} else {
			System.out.print(eachEmployee.getEmployeeID() + "\t" + eachEmployee.getEmployeeName() + "\t"
					+ eachEmployee.getEmployeeType() + "\t");
			for (Entry<LeaveDetails, Integer> eachEntry : eachEmployee.leaveForEmployee.entrySet()) {
				System.out.println(eachEntry.getKey().getLeaveID() + "\t" + eachEntry.getKey().getLeaveType() + "\t"
						+ eachEntry.getValue());
			}
		}
	}

}
