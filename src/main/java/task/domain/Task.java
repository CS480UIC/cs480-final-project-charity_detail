package task.domain;

/**
 * User object
 * 
 * @author Shaun Kollannur
 * 
 */
public class Task {
	/*
	 * Correspond to the user table
	 */
	
	private String name;
	private int campaign_id; 
	private String description;
	private int number_of_participant;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCampaign_id() {
		return campaign_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getNumPart() {
		return number_of_participant;
	}
	
	public void setNumPart(int number_of_participant) {
		this.number_of_participant = number_of_participant;
	}

	@Override
	public String toString() {
		return "Task [ name=" + name + ", campaign_id="
				+ campaign_id + ", description=" + description + ", number_of_participant=" + number_of_participant + "]";
	}

	public void setCampaign_id(int campaign_id) {
		// TODO Auto-generated method stub
		this.campaign_id = campaign_id;
		
	}

}
