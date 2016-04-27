package cs362_project;

public class Team {

	private int TID;
	private int MID;

	public Team() {
		TID = -1;
		MID = -1;
	}

	public Team (int TID){
		this.TID = TID;
	}
	
	public Team(int TID, int MID) {
		this.TID = TID;
		this.MID = MID;
	}
	
	public void addManager(int mid) {
		this.MID = mid;
	}

	public void RemoveManager() {
		this.MID = -1;
	}

	public int getTID() {
		return TID;
	}

	public void setTID(int TID) {
		this.TID = TID;
	}

	public int getMID() {
		return MID;
	}

	public void setMID(int MID) {
		this.MID = MID;
	}

	public boolean endTask(int taskid) {
		try {
			DatabaseSupport d = new DatabaseSupport();
			d.endTask(taskid);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean assignTask(int taskid, Member m) {
		try{
			DatabaseSupport d = new DatabaseSupport();
			
			d.assignTask(taskid, m);
			
		}catch (Exception e){
			return false;
		}
		return true;
	}
}