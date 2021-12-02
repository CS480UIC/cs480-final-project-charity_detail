package queries.domain;


/**
 * User object
 * @author Judhajit
 */
public class TaskVolunteers {
	/*
	 * Correspond to the user table
	 */
	
	private Integer campaign_id;
	public Integer getCampaign_id() {
		return campaign_id;
	}


	public void setCampaign_id(Integer campaign_id) {
		this.campaign_id = campaign_id;
	}


	public Integer getTotal_volunteers() {
		return total_volunteers;
	}


	public void setTotal_volunteers(Integer total_volunteers) {
		this.total_volunteers = total_volunteers;
	}


	private Integer total_volunteers;


	@Override
	public String toString() {
		return "TaskVolunteers [ campaign_id=" + campaign_id +  ", total_volunteers=" + total_volunteers + "]";
	}
}
