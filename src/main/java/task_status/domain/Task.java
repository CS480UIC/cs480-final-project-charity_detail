package task_status.domain;

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
	
	private String status;
	private String remark;
	private int id;
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	
	
	@Override
	public String toString() {
		return "Task [ id=" + id + ", status="
				+ status + ", remark=" + remark + "]";
	}

}
