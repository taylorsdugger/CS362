package cs362_project;

import java.util.Scanner;

public class Main {
	
	static TeamManager tm = new TeamManager();
	
	//Testing
	  public static void main(String[] args) throws Exception {
	    while(true){
	    	try{
	    		takeCommand();
	    	} catch (Exception e) {
	    		System.out.println("Error in Parsing");
	    	}
	    }
	  }
	  
	  public static void takeCommand() throws Exception{
	  	Scanner s = new Scanner(System.in);
	  	String temp = s.nextLine();
	  	
	  	if(temp.equalsIgnoreCase("createTeam")) {
	  		//Get Parameter
	  		System.out.print("\nTeam ID: ");
	  		int id = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.createTeam(id)) {
	  				//Returned True
	  				System.out.println("Team Created");
	  			} else {
	  				//Returned False
	  				System.out.println("Team failed to Create");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("Team Creation Error");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("deleteTeam")) {
	  		//Get Parameter
	  		System.out.print("\nTeam ID: ");
	  		int id = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.deleteTeam(id)) {
	  				//Returned True
	  				System.out.println("Team Deleted");
	  			} else {
	  				//Returned False
	  				System.out.println("Team failed to Delete");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("Team Deletion Error");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("assignManager")) {
<<<<<<< HEAD
	  		try {
	  			//Get Parameter
	  			System.out.print("\nManager ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
=======
	  		//Get Parameter
	  		System.out.print("\Manager ID: ");
	  		int mid = s.nextInt();
	  		System.out.print("\nTeam ID: ");
	  		int tid = s.nextInt();
>>>>>>> 703ddab8500a47165c28068c9430a1f5088e16f9
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.addManager(mid, tid)) {
	  				//Returned True
	  				System.out.println("Manager Assigned to Team");
	  			} else {
	  				//Returned False
	  				System.out.println("Failed to Assign manager");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("Error in assigning manager");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("removeManager")) {
<<<<<<< HEAD
	  		try {
	  			//Get Parameter
	  			System.out.print("\nManager ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
=======
	  		//Get Parameter
	  		System.out.print("\Manager ID: ");
	  		int mid = s.nextInt();
	  		System.out.print("\nTeam ID: ");
	  		int tid = s.nextInt();
>>>>>>> 703ddab8500a47165c28068c9430a1f5088e16f9
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.removeManager(mid, tid)) {
	  				//Returned True
	  				System.out.println("Manger removed from Team");
	  			} else {
	  				//Returned False
	  				System.out.println("Failed to remove Manager");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("addMember")) {
<<<<<<< HEAD
	  		try {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
=======
	  		//Get Parameter
	  		System.out.print("\Member ID: ");
	  		int mid = s.nextInt();
	  		System.out.print("\nTeam ID: ");
	  		int tid = s.nextInt();
>>>>>>> 703ddab8500a47165c28068c9430a1f5088e16f9
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.addMember(mid, tid)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("removeMember")) {
<<<<<<< HEAD
	  		try {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
=======
  			//Get Parameter
  			System.out.print("\Member ID: ");
  			int mid = s.nextInt();
  			System.out.print("\nTeam ID: ");
  			int tid = s.nextInt();
  		
>>>>>>> 703ddab8500a47165c28068c9430a1f5088e16f9
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.removeMember(mid, tid)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("listMembers")) {
	  		//Get Parameter
	  		System.out.print("\nTeam ID: ");
	  		int tid = s.nextInt();
	  			
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			ArrayList<Member> mem = tm.listMembers(tid);
	  			if(mem) {
	  				//Returned True
	  				System.out.println(mem);
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("addContact")) {
<<<<<<< HEAD
	  		try {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nPhone: ");
	  			String phone = s.nextLine();
	  			System.out.print("\nEmail: ");
	  			String email = s.nextLine();
	  			//TODO
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
=======
	  		//Get Parameter
	  		System.out.print("\nMember ID: ");
	  		int mid = s.nextInt();
	  		System.out.print("\Phone: ");
	  		String phone = s.nextLine();
	  		System.out.print("\Email: ");
	  		String email = s.nextLine();
>>>>>>> 703ddab8500a47165c28068c9430a1f5088e16f9
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.addContact(mid, phone, email)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("updateContact")) {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nPhone: ");
	  			String phone = s.nextLine();
	  			System.out.print("\nEmail: ");
	  			String email = s.nextLine();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.updateContact(mid, /*TODO*/)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("createEmployee")) {
	  			//Get Parameter
	  			System.out.print("\nEmployee Name: ");
	  			String name = s.nextLine();
	  			System.out.print("\nEmployee ID: ");
	  			int mid = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.createEmployee(name, mid)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("createManager")) {
	  			//Get Parameter
	  			System.out.print("\nEmployee Name: ");
	  			String name = s.nextLine();
	  			System.out.print("\nEmployee ID: ");
	  			int mid = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.addMember(name, mid)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("createTask")) {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  			System.out.print("\nTask Desc: ");
	  			String desc = s.nextLine();
	  			System.out.print("Due Date: ");
	  			String date = s.nextLine();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.createTask(tid, desc, date)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("assignTask")) {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.assignTask(tid, mid)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("endTask")) {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			if(tm.endTask(tid)) {
	  				//Returned True
	  				System.out.println("Success");
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("checkTaskOfMember")) {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			ArrayList<Task> tasks = tm.listMembers(tid);
	  			if(tasks) {
	  				//Returned True
	  				System.out.println(tasks);
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else if(temp.equalsIgnoreCase("checkMembersOnTask")) {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  		
	  		System.out.println();
	  		
	  		//Try Command
	  		try{
	  			ArrayList<Member> mem = tm.checkMembersOnTask(tid);
	  			if(mem) {
	  				//Returned True
	  				System.out.println(mem);
	  			} else {
	  				//Returned False
	  				System.out.println("Failure");
	  			}
	  		} catch (Exception e) {
	  			//Error
	  			System.out.println("ERROR");
	  		}
	  		
	  	} else {
	  		//Help
	  		System.out.println("Not a Command");
	  	}
	  	
	  	s.close();
	  }
} 


