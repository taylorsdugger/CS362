package cs362_project;

public class Main {
	
	TeamManager tm = new TeamManager();
	
	//Testing
	  public static void main(String[] args) throws Exception {
	    while(true){
	    	takeCommand();
	    }
	  }
	  
	  public static void takeCommand() {
	  	Scanner s = new Scanner(System.in);
	  	String temp = s.nextLine();
	  	
	  	if(temp.equalsIgnoreCase("createTeam")) {
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTeam ID: ");
	  			int id = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTeam ID: ");
	  			int id = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\Manager ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\Manager ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\Member ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\Member ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTeam ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\Phone: ");
	  			String phone = s.nextLine();
	  			System.out.print("\Email: ");
	  			String email = s.nextLine();
	  			//TODO
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  			System.out.print("\Phone: ");
	  			String phone = s.nextLine();
	  			System.out.print("\Email: ");
	  			String email = s.nextLine();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nEmployee Name: ");
	  			String name = s.nextLine();
	  			System.out.print("\nEmployee ID: ");
	  			int mid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nEmployee Name: ");
	  			String name = s.nextLine();
	  			System.out.print("\nEmployee ID: ");
	  			int mid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  			System.out.print("\nTask Desc: ");
	  			String desc = s.nextLine();
	  			System.out.print("Due Date: ");
	  			String date = s.nextLine();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nMember ID: ");
	  			int mid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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
	  		try {
	  			//Get Parameter
	  			System.out.print("\nTask ID: ");
	  			int tid = s.nextInt();
	  		} catch (Exception e) {
	  			System.out.println("Error in Parsing parameters");
	  		}
	  		
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


