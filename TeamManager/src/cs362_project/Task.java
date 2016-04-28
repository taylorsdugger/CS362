package cs362_project;

public class Task {

	private int taskid = -1;
	private String employees = "";
	private String date = "";
	private String desc = "";
	private int completed = 0;
	private int tid = -1;

	public Task(){
		
	}
	
	public Task(int taskid, String desc, String date){
		this.taskid = taskid;
		this.desc = desc;
		this.date = date;
	}
	
	public Task(int taskid, String desc, String date, String employees, int completed, int tid){
		this.taskid = taskid;
		this.desc = desc;
		this.date = date;
		this.employees = employees;
		this.completed = completed;
		this.tid = tid;
	}
	
	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = this.employees + ", " + employees;
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
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}
}
