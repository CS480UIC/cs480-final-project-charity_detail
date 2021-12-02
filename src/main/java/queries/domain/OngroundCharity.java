package queries.domain;


/**
 * User object
 * @author Judhajit
 */
public class OngroundCharity {
	/*
	 * Correspond to the user table
	 */
	
	private String name; 
	private String cause;
	private Integer target_region_id;

	






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
		return "OngroundCharity [ name=" + name + ", cause="
				+ cause + ", target_region_id=" + target_region_id + "]";
	}
}
