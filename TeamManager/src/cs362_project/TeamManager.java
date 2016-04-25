package cs362_project;

import cs362_project.*;

import java.util.ArrayList;

public class TeamManager {
	DatabaseSupport d = new DatabaseSupport();

	public boolean createTeam(int teamid) {
		try {

			Team t = new Team(teamid);

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean deleteTeam(int teamid) {
		try {

			d.deleteTeam(teamid);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean createManager(int managerid, String name) {
		try {

			Member m = new Member();
			m.setName(name);
			m.setMID(managerid);

			d.putManager(m);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean assignManager(int teamid, int managerid) {
		try {

			Team t = d.getTeam(teamid);

			t.addManager(managerid);

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean unassignManager(int teamid, int managerid) {
		try {

			Team t = d.getTeam(teamid);

			t.RemoveManager();

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean createEmployee(int employeeid, String name) {
		try {

			Member m = new Member();
			m.setName(name);
			m.setMID(employeeid);

			d.addMember(m);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean assignEmployee(int teamid, int employeeid) {
		try {
			Member m = d.getMember(employeeid);
			Team t = d.getTeam(teamid);
			d.putMemberIntoTeam(m);

		} catch (Exception e) {
			return false;

		}
		return true;
	}

	public boolean unassignEmployee(int teamid, int employeeid) {
		try {
			d.removeMember(employeeid);
		} catch (Exception e) {
			return false;

		}
		return true;
	}

	public ArrayList<Member> listMembersOfTeam(int teamid) {
		try {
			return d.getMembers(teamid);

		} catch (Exception e) {
			return null;

		}
	}

	public boolean addContactForEmployee(int employeeid, String phone, String email) {
		try {
			Member m = d.getMember(employeeid);

			m.setPhone(phone);
			m.setEmail(email);

			d.putMemberContactInfo(m);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean updateContactForEmployee(int employeeid, String phone, String email) {
		try {
			Member m = d.getMember(employeeid);

			m.setPhone(phone);
			m.setEmail(email);

			d.putMemberContactInfo(m);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean createTaskForTeam(int teamid, int taskid, String desc, String date) {
		try {
			// TODO
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean assignTaskToEmployee(int teamid, int taskid, int employeeid) {
		try {
			// TODO
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean endTask(int teamid, int taskid) {
		try {
			// TODO
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public ArrayList<Task> listTasksOfMember(int employeeid) {
		try {
			// TODO
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public ArrayList<Member> listMembersOnTask(int teamid, int taskid) {
		try {
			// TODO
		} catch (Exception e) {
			return null;
		}
		return null;
	}
}