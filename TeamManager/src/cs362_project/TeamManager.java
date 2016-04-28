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
			d.assignManager(t);

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
			d.unassignManager(managerid);
			
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
			
			d.putMemberIntoTeam(m, t);

		} catch (Exception e) {
			return false;

		}
		return true;
	}

	public boolean unassignEmployee(int teamid, int employeeid) {
		try {
			
			d.unassignMember(employeeid);
			
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
			Team t = d.getTeam(teamid);
			
			Task ts = new Task(taskid, desc, date);
			
			d.createTaskForTeam(ts, teamid);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean assignTaskToEmployee(int teamid, int taskid, int employeeid) {
		try {
			
			Member m = d.getMember(employeeid);
			Team t = d.getTeam(teamid);

			t.assignTask(taskid, m);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean endTask(int teamid, int taskid) {
		try {
			
			Team t = d.getTeam(teamid);
			t.endTask(taskid);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public String listTasksOfMember(int employeeid) {
		try {
			Member m = d.getMember(employeeid);
			
			String tasks = (m.getTasks());
			
			return tasks;
		} catch (Exception e) {
			return null;
		}
	}

	public String listMembersOnTask(int teamid, int taskid) {
		try {
			Task t = d.getTask(taskid);
			
			String employees = (t.getEmployees());
			//Parse through employees. Should be in 10, 3, 5, 9 format.
			
			return employees;
		} catch (Exception e) {
			return null;
		}
	}
}