package cs362_project;

public class Main {
	
	//Testing
	  public static void main(String[] args) throws Exception {
	    DatabaseSupport d = new DatabaseSupport();
	    
	    Team t= new Team(1, 34);
	    Team t2 = new Team(4, 77);
	    
	    d.putTeam(t);
	    d.putTeam(t2);
	  }
} 

