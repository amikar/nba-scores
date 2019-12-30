package nba_score_parent.nba_score.controller;

public class ControllerResponse {
	private String team1Name;
	private String team1Score;
	private String team2Name;
	private String team2Score;
	private Boolean isGameActivated;
	
	public String getTeam1Name() {
		return team1Name;
	}
	public void setTeam1Name(String team1Name) {
		this.team1Name = team1Name;
	}
	public String getTeam1Score() {
		return team1Score;
	}
	public void setTeam1Score(String team1Score) {
		this.team1Score = team1Score;
	}
	public String getTeam2Name() {
		return team2Name;
	}
	public void setTeam2Name(String team2Name) {
		this.team2Name = team2Name;
	}
	public String getTeam2Score() {
		return team2Score;
	}
	public void setTeam2Score(String team2Score) {
		this.team2Score = team2Score;
	}
	public Boolean getIsGameActivated() {
		return isGameActivated;
	}
	public void setIsGameActivated(Boolean isGameActivated) {
		this.isGameActivated = isGameActivated;
	}

}
