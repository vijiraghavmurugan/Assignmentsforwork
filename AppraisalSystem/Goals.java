package appraisalRating;

public class Goals {
	private String goalID;
	private String goalName;
	private String goalDescription;
	private int goalDuration;
	private String goalStatus;
	private boolean goalEnableWeightage;
	private int goalWeightage;

	public String getGoalID() {
		return goalID;
	}

	public void setGoalID(String goalID) {
		this.goalID = goalID;
	}

	public String getGoalName() {
		return goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	public String getGoalDescription() {
		return goalDescription;
	}

	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}

	public int getGoalDuration() {
		return goalDuration;
	}

	public void setGoalDuration(int goalDuration) {
		this.goalDuration = goalDuration;
	}

	public String getGoalStatus() {
		return goalStatus;
	}

	public void setGoalStatus(String goalStatus) {
		this.goalStatus = goalStatus;
	}

	public boolean isGoalEnableWeightage() {
		return goalEnableWeightage;
	}

	public void setGoalEnableWeightage(boolean goalEnableWeightage) {
		this.goalEnableWeightage = goalEnableWeightage;
	}

	public int getGoalWeightage() {
		return goalWeightage;
	}

	public void setGoalWeightage(int goalWeightage) {
		this.goalWeightage = goalWeightage;
	}

	public Goals() {

	}

	public Goals(String goalID, String goalName, String goalDescription, int goalDuration, String goalStatus,
			boolean goalEnableWeightage, int goalWeightage) {

		this.goalID = goalID;
		this.goalName = goalName;
		this.goalDescription = goalDescription;
		this.goalDuration = goalDuration;
		this.goalStatus = goalStatus;
		this.goalEnableWeightage = goalEnableWeightage;
		this.goalWeightage = goalWeightage;
	}

}
