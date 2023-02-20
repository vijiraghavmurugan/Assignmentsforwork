package appraisalRating;

public class Projects {
	private String projectID;
	private String projectName;
	private int projectDuration;
	private String projectStatus;
	private boolean projectEnableWeightage;
	private int projectWeightage;

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(int projectDuration) {
		this.projectDuration = projectDuration;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public boolean isProjectEnableWeightage() {
		return projectEnableWeightage;
	}

	public void setProjectEnableWeightage(boolean projectEnableWeightage) {
		this.projectEnableWeightage = projectEnableWeightage;
	}

	public int getProjectWeightage() {
		return projectWeightage;
	}

	public void setProjectWeightage(int projectWeightage) {
		this.projectWeightage = projectWeightage;
	}

	public Projects(String projectID, String projectName, int projectDuration, String projectStatus,
			boolean projectEnableWeightage, int projectWeightage) {
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.projectStatus = projectStatus;
		this.projectEnableWeightage = projectEnableWeightage;
		this.projectWeightage = projectWeightage;
	}

}
