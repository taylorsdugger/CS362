package cs362_project;

public class Team {

	private int TID;
	private int MID;

	public Team() {
		TID = -1;
		MID = -1;
	}

	public Team(int TID, int MID) {
		this.TID = TID;
		this.MID = MID;
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

	public boolean updateContactInfo(int mid2, String phone, String email) {
		try {
			DatabaseSupport d = new DatabaseSupport();

			Member m = d.getMember(mid2);
			m.setPhone(phone);
			m.setEmail(email);
			
			d.putMemberContactInfo(m);
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
}
