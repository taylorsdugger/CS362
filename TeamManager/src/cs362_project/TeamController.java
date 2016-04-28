package cs362_project;

import java.util.ArrayList;

public class TeamController {

	private static TeamManager tm = new TeamManager();

	public static boolean createTeam(int teamid) {
		try {
			if (tm.createTeam(teamid)) {
				// Returned True
				System.out.println("Success");
				return true;
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}

		return false;
	}

	public static boolean deleteTeam(int teamid) {
		try {
			if (tm.deleteTeam(teamid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean createManager(int managerid, String name) {
		try {
			if (tm.createManager(managerid, name)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean assignManager(int teamid, int managerid) {
		try {
			if (tm.assignManager(teamid, managerid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean unassignManager(int teamid, int managerid) {
		try {
			if (tm.unassignManager(teamid, managerid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean createEmployee(int employeeid, String name) {
		try {
			if (tm.createEmployee(employeeid, name)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean assignEmployee(int teamid, int employeeid) {
		try {
			if (tm.assignEmployee(teamid, employeeid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean unassignEmployee(int teamid, int employeeid) {
		try {
			if (tm.unassignEmployee(teamid, employeeid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean listMembersOfTeam(int teamid) {
		try {
			ArrayList<Member> mems = tm.listMembersOfTeam(teamid);
			if (mems != null) {
				// Returned True
				System.out.println("");
				for(int i = 0; i < mems.size(); i++){
					System.out.print(mems.get(i).getMID() + ", ");
				}
				System.out.println("");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean addContactForEmployee(int employeeid, String phone, String email) {
		try {
			if (tm.addContactForEmployee(employeeid, phone, email)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean updateContactForEmployee(int employeeid, String phone, String email) {
		try {
			if (tm.updateContactForEmployee(employeeid, phone, email)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean createTaskForTeam(int teamid, int taskid, String desc, String date) {
		try {
			if (tm.createTaskForTeam(teamid, taskid, desc, date)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean assignTaskToEmployee(int teamid, int taskid, int employeeid) {
		try {
			if (tm.assignTaskToEmployee(teamid, taskid, employeeid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean endTask(int teamid, int taskid) {
		try {
			if (tm.endTask(teamid, taskid)) {
				// Returned True
				System.out.println("Success");
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean listTasksOfMember(int employeeid) {
		try {
			String tasks = tm.listTasksOfMember(employeeid);
			if (tasks != null) {
				// Returned True
				System.out.println(tasks);
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

	public static boolean listMembersOnTask(int teamid, int taskid) {
		try {
			String mems = tm.listMembersOnTask(teamid, taskid);
			if (mems != null) {
				// Returned True
				System.out.println(mems);
			} else {
				// Returned False
				System.out.println("Failure");
			}
		} catch (Exception e) {
			// Error
			System.out.println("ERROR");
		}
		return false;
	}

}
