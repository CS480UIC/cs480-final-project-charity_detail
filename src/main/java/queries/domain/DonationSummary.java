package queries.domain;

/**
 * User object
 * @author Aayush Makharia
 */
public class DonationSummary {
	/*
	 * Correspond to the user table
	 */
	
	private Integer id;
	private String name; 
	private String cause;
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	private Integer target_region_id;
	

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Integer getTarget_region_id() {
		return target_region_id;
	}

	public void setTarget_region_id(Integer target_region_id) {
		this.target_region_id = target_region_id;
	}

		
	@Override
	public String toString() {
		return "DonationSummary [ id=" + id + ", name="
				+ name + ", cause=" + cause + ", address=" + address + ", target_region_id=" + target_region_id +"]";
	}
}
