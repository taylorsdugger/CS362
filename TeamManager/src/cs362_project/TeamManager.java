package cs362_project;

public class TeamManager {
	DatabaseSupport d = new DatabaseSupport();
	
	public boolean createTeam(String name, String tid, String mid) {
		try {

			Team t = new Team(String name, String tid, String mid);

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public boolean deleteTeam(String tid) {
		try {

			d.deleteTeam(tid);

		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public boolean addManager(int mid, int tid) {
		try {

			Team t = d.getTeam(tid);

			t.addUpdateContactInfoManager();

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean RemoveManager(int mid, int tid) {
		try {

			Team t = d.getTeam(tid);

			t.RemoveManager();

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean addUpdateContactInfo(int mid, int tid, String phone, String email) {
		try {
			Team t = d.getTeam(tid);
			
			t.updateContactInfo(mid, phone, email);
			
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
