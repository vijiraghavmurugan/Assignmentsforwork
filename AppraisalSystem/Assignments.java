package appraisalRating;

public class Assignments  {
	private String assignmentID;
	private String assignmentName;
	private int assignmentDuration;
	private String assignmentTopic;
	private String assignmentStatus;
	private boolean assignmentEnableWeightage;
	private int assignmentWeightage;

	public String getAssignmentID() {
		return assignmentID;
	}

	public void setAssignmentID(String assignmentID) {
		this.assignmentID = assignmentID;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public int getAssignmentDuration() {
		return assignmentDuration;
	}

	public void setAssignmentDuration(int assignmentDuration) {
		this.assignmentDuration = assignmentDuration;
	}

	public String getAssignmentTopic() {
		return assignmentTopic;
	}

	public void setAssignmentTopic(String assignmentTopic) {
		this.assignmentTopic = assignmentTopic;
	}

	public String getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}

	public boolean isAssignmentEnableWeightage() {
		return assignmentEnableWeightage;
	}

	public void setAssignmentEnableWeightage(boolean assignmentEnableWeightage) {
		this.assignmentEnableWeightage = assignmentEnableWeightage;
	}

	public int getAssignmentWeightage() {
		return assignmentWeightage;
	}

	public void setAssignmentWeightage(int assignmentWeightage) {
		this.assignmentWeightage = assignmentWeightage;
	}

	public Assignments(String assignmentID, String assignmentName, int assignmentDuration, String assignmentTopic,
			String assignmentStatus, boolean assignmentEnableWeightage, int assignmentWeightage) {

		this.assignmentID = assignmentID;
		this.assignmentName = assignmentName;
		this.assignmentDuration = assignmentDuration;
		this.assignmentTopic = assignmentTopic;
		this.assignmentStatus = assignmentStatus;
		this.assignmentEnableWeightage = assignmentEnableWeightage;
		this.assignmentWeightage = assignmentWeightage;
	}

}
