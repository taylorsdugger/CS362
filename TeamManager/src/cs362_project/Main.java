package cs362_project;

import java.util.Scanner;

public class Main {

	// Testing
	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			try {
				doThings(s);
			} catch (Exception e) {
				System.out.println("Error in Parsing");
			}
		}
	}

	public static void doThings(Scanner s) throws Exception {
		String input = s.nextLine();
		
		if (input.equals("createTeam")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();

			TeamController.createTeam(teamid);
		}
		
		if (input.equals("deleteTeam")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();

			TeamController.deleteTeam(teamid);
		}
		
		if (input.equals("createManager")) {
			System.out.print("Manager ID: ");
			int managerid = s.nextInt();
			System.out.println();
			
			System.out.print("Manager Name: ");
			String name = s.nextLine();
			s.next();
			System.out.println();

			TeamController.createManager(managerid, name);
		}
		
		if (input.equals("assignManager")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Manager ID: ");
			int managerid = s.nextInt();
			System.out.println();

			TeamController.assignManager(teamid, managerid);
		}
		
		if (input.equals("unassignManager")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Manager ID: ");
			int managerid = s.nextInt();
			System.out.println();

			TeamController.unassignManager(teamid, managerid);
		}
		
		if (input.equals("createEmployee")) {
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();
			
			System.out.print("Employee Name: ");
			String name = s.nextLine();
			System.out.println();

			TeamController.createEmployee(employeeid, name);
		}
		
		if (input.equals("assignEmployee")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();

			TeamController.assignEmployee(teamid, employeeid);
		}
		
		if (input.equals("unassignEmployee")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();

			TeamController.unassignEmployee(teamid, employeeid);
		}

		if (input.equals("listMembersOfTeam")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();

			TeamController.listMembersOfTeam(teamid);
		}

		if (input.equals("addContactForEmployee")) {
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();
			
			System.out.print("Phone: ");
			String phone = s.nextLine();
			System.out.println();
			
			System.out.print("Email: ");
			String email = s.nextLine();
			System.out.println();

			TeamController.addContactForEmployee(employeeid, phone, email);
		}

		if (input.equals("updateContactForEmployee")) {
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();
			
			System.out.print("Phone: ");
			String phone = s.nextLine();
			System.out.println();
			
			System.out.print("Email: ");
			String email = s.nextLine();
			System.out.println();

			TeamController.addContactForEmployee(employeeid, phone, email);
		}
		
		if (input.equals("createTaskForTeam")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Task ID: ");
			int taskid = s.nextInt();
			System.out.println();
			
			System.out.print("Description: ");
			String desc = s.nextLine();
			System.out.println();
			
			System.out.print("Dead Line: ");
			String date = s.nextLine();
			System.out.println();

			TeamController.createTaskForTeam(teamid, taskid, desc, date);
		}
		
		if (input.equals("assignTaskToEmployee")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Task ID: ");
			int taskid = s.nextInt();
			System.out.println();
			
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();
			
			TeamController.assignTaskToEmployee(teamid, taskid, employeeid);
		}

		if (input.equals("endTask")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Task ID: ");
			int taskid = s.nextInt();
			System.out.println();
			
			TeamController.endTask(teamid, taskid);
		}

		if (input.equals("listTasksOfMember")) {
			System.out.print("Employee ID: ");
			int employeeid = s.nextInt();
			System.out.println();
			
			TeamController.listTasksOfMember(employeeid);
		}
		
		if (input.equals("listMembersOnTask")) {
			System.out.print("Team ID: ");
			int teamid = s.nextInt();
			System.out.println();
			
			System.out.print("Task ID: ");
			int taskid = s.nextInt();
			System.out.println();
			
			TeamController.listMembersOnTask(teamid, taskid);
		}

	}
}
