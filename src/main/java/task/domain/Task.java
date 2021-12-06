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
	private int id;
	private String name;
	private int campaign_id; 
	private String description;

	private int number_of_participants;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}
	
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
	
	public int getNumber_of_participants() {
		return number_of_participants;
	}
	
	public void setNumber_of_participants(int number_of_participants) {
		this.number_of_participants = number_of_participants;
	}

	@Override
	public String toString() {
		return "Task [ name=" + name + ", campaign_id="
				+ campaign_id + ", description=" + description + ", number_of_participant=" + number_of_participants + "]";
	}

	public void setCampaign_id(int campaign_id) {
		// TODO Auto-generated method stub
		this.campaign_id = campaign_id;
		
	}

}
