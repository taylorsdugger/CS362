package cs362_project;

public class TeamManager {
	DatabaseSupport d = new DatabaseSupport();
	
	public boolean createTeam(int tid, int mid) {
		try {

			Team t = new Team(int tid, int mid);

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public boolean deleteTeam(int tid) {
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

			t.addManager(mid);

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
