package donation.domain;

/**
 * User object
 * @author Aayush Makharia
 */
public class Donation {
	/*
	 * Correspond to the user table
	 */
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	private String donor_name;
	private String charity_id; 
	private String donation_amount;
	

	
	public String getdonor_name() {
		return donor_name;
	}

	public void setdonor_name(String donor_name) {
		this.donor_name = donor_name;
	}

	public String getcharity_id() {
		return charity_id;
	}

	public void setcharity_id(String charity_id) {
		this.charity_id = charity_id;
	}

	public String getdonation_amount() {
		return donation_amount;
	}

	public void setdonation_amount(String donation_amount) {
		this.donation_amount = donation_amount;
	}

	
	@Override
	public String toString() {
		return "Donation [ donor_name=" + donor_name + ", charity_id="
				+ charity_id + ", donation_amount=" + donation_amount +"]";
	}
}
