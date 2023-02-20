package appraisalRating;

import java.util.HashMap;

public class Employee {
	private int employeeID;
	private String employeeName;
	private String employeeDesignation;
	private int reportingAuthorityID;

	static HashMap<Integer, Goals> goalsMap = new HashMap<Integer, Goals>();
	static HashMap<Integer, Assignments> assignmentsMap = new HashMap<Integer, Assignments>();
	static HashMap<Integer, Projects> projectsMap = new HashMap<Integer, Projects>();

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

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getReportingAuthorityID() {
		return reportingAuthorityID;
	}

	public void setReportingAuthorityID(int reportingAuthorityID) {
		this.reportingAuthorityID = reportingAuthorityID;
	}

	public Employee() {

	}

	public Employee(int employeeID, String employeeName, String employeeDesignation, int reportingAuthorityID) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.reportingAuthorityID = reportingAuthorityID;
	}

	public Employee(int employeeID) {
		this.employeeID = employeeID;
	}

}
