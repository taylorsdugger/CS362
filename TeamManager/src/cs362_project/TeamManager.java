package cs362_project;

import cs362_project.Member;

import java.util.List;

public class TeamManager {
	DatabaseSupport d = new DatabaseSupport();
	
	public boolean createTeam(int tid, int mid) {
		try {

			Team t = new Team(tid);

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public boolean createEmployee(String name, int mid){
		try{
			
			Member m = new Member();
			m.setName(name);
			m.setMID(mid);
			
			d.addMember(m);
			
		}catch (Exception e){
			return false;
		}
		return true;
	}
	
	public boolean createManager(String name, int mid){
		try{
			
			Member m = new Member();
			m.setName(name);
			m.setMID(mid);
			
			d.putManager(m);
			
		}catch(Exception e){
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

	public boolean removeManager(int mid, int tid) {
		try {

			Team t = d.getTeam(tid);

			t.RemoveManager();

			d.putTeam(t);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public boolean updateContactInfo(int mid, int tid, String phone, String email) {
		try {
			Member m = d.getMember(mid);
			
			m.setPhone(phone);
			m.setEmail(email);
			
			d.putMemberContactInfo(m);
			
		} catch (Exception e) {
			return false;
		}

		return true;
	}
	
	public boolean addMember(String name, int TiD,int MiD)
	{
		try
		{
			Member m = new Member(MiD,TiD,name);
			d.putMemberIntoTeam(m);	
			
		}catch(Exception e)
		{
			return false;
			
		}
		return true;
	}
	public boolean deleteMember(int mid)
	{
		
		try
		{
			d.removeMember(mid);
		}catch(Exception e)
		{
			return false;
			
		}
		return true;
	}
	public List<Member> listMember(int tID)
	{	
		try
		{
			return d.getMembers(tID);
		}catch(Exception e)
		{
			return null;
			
		}
		
	}
}