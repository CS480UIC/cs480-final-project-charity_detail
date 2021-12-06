package donation.domain;

/**
 * User object
 * @author Judhajit
 */
public class Task {
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
	private Integer charity_id; 
	private String donation_amount;
	

	



	public Integer getCharity_id() {
		return charity_id;
	}

	public void setCharity_id(Integer charity_id) {
		this.charity_id = charity_id;
	}

	public String getDonor_name() {
		return donor_name;
	}

	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}

	public String getDonation_amount() {
		return donation_amount;
	}

	public void setDonation_amount(String donation_amount) {
		this.donation_amount = donation_amount;
	}

	@Override
	public String toString() {
		return "Donation [ donor_name=" + donor_name + ", charity_id="
				+ charity_id + ", donation_amount=" + donation_amount +"]";
	}
}
