package cs362_project;

public class Task {

	private int taskid = -1;
	private int employeeid = -1;
	private String date = "";
	private String desc = "";
	private int completed = 0;
	
	public Task(){
		
	}
	
	public Task(int taskid, String desc, String date){
		this.taskid = taskid;
		this.desc = desc;
		this.date = date;
		
	}
	
	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}
}
