package cs362_project;

public class Member {
	
	private int MID = -1;
	private int TID = -1;
	private String name = "";
	private String phone = "";
	private String email = "";
	private String tasks = "";
	
	public Member(){
	}
	
	public Member(int MID, int TID, String name){
		this.MID = MID;
		this.TID = TID;
		this.name = name;
	}
	
	public Member(int MID, int TID, String name, String phone, String email, String tasks){
		this.MID = MID;
		this.TID = TID;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.tasks = tasks;
	}
	
	public void setTID(int TID){
		this.TID = TID;
	}
	
	public int getTID(){
		return this.TID;
	}
	
	public void setMID(int MID){
		this.MID = MID;
	}
	public int getMID(){
		return this.MID;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getTasks() {
		return this.tasks;
	}
	
	public void assignTask(int taskid) {
		this.tasks += ", " + taskid;
	}
}
