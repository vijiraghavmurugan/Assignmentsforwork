package leaveTracker;

public class LeaveDetails {
	private String leaveID;
	private String leaveType;

	public String getLeaveID() {
		return leaveID;
	}

	public void setLeaveID(String leaveID) {
		this.leaveID = leaveID;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public LeaveDetails(String leaveID, String leaveType) {
		super();
		this.leaveID = leaveID;
		this.leaveType = leaveType;
	}

}
