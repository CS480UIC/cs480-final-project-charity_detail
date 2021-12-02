package queries.domain;

import java.sql.Date;

/**
 * User object
 * @author Judhajit
 */
public class FinishedCampaigns {
	/*
	 * Correspond to the user table
	 */
	
	private String name; 
	private Integer charity_id;
	private Integer target_region_id;
	private Date start_date;
	private Date end_date;
	


		
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getCharity_id() {
		return charity_id;
	}




	public void setCharity_id(Integer charity_id) {
		this.charity_id = charity_id;
	}




	public Integer getTarget_region_id() {
		return target_region_id;
	}




	public void setTarget_region_id(Integer target_region_id) {
		this.target_region_id = target_region_id;
	}




	public Date getStart_date() {
		return start_date;
	}




	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}




	public Date getEnd_date() {
		return end_date;
	}




	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}




	@Override
	public String toString() {
		return "FinishedCampaigns [ name=" + name + ", charity_id="
				+ charity_id + ", target_region_id=" + target_region_id + ", start_date=" + start_date + ", end_date=" + end_date +"]";
	}
}
