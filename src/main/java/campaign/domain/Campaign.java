package campaign.domain;

/**
 * User object
 * 
 * @author Shaun Kollannur
 * 
 */
public class Campaign {
	/*
	 * Correspond to the user table
	 */
	
	private int id;
	private int charity_id;
	private String name;
	private String start_date;
	private int target_region_id;
	private String end_date;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCharity_id() {
		return charity_id;
	}

	public void setCharity_id(int charity_id) {
		this.charity_id = charity_id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart_date() {
		return start_date;
	}


	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}


	public int getTarget_region_id() {
		return target_region_id;
	}

	public void setTarget_region_id(int target_region_id) {
		this.target_region_id = target_region_id;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	
	@Override
	public String toString() {
		return "Task [ id=" + id + ", charity_id="
				+ charity_id + ", name=" + name + "]";
	}

}
