package cs362_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseSupport {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	String connectionURL = "jdbc:mysql://localhost/TEAMDB?autoReconnect=true&useSSL=false";

	public void putTeam(Team t) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			preparedStatement = connect
					.prepareStatement("SELECT COUNT(*) FROM (SELECT * FROM Teams WHERE tid = ?) as f");
			preparedStatement.setInt(1, t.getTID());
			resultSet = preparedStatement.executeQuery();

			resultSet.next();

			int a = resultSet.getInt(1);

			if (a > 0) {
				preparedStatement = connect.prepareStatement("UPDATE TEAMDB.Teams SET manager = ? WHERE tid = ?");
				preparedStatement.setInt(1, t.getMID());
				preparedStatement.setInt(2, t.getTID());
				preparedStatement.executeUpdate();
			} else {
				preparedStatement = connect.prepareStatement("insert into  TEAMDB.Teams values (?, ?)");
				preparedStatement.setInt(1, t.getTID());
				preparedStatement.setInt(2, t.getMID());
				preparedStatement.executeUpdate();
			}

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public void deleteTeam(int tid) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			preparedStatement = connect.prepareStatement("delete from TEAMDB.Teams where tid= ? ; ");
			preparedStatement.setInt(1, tid);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public Team getTeam(int tid) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			preparedStatement = connect.prepareStatement("Select * from Teams WHERE tid= ?");
			preparedStatement.setInt(1, tid);
			resultSet = preparedStatement.executeQuery();

			resultSet.next();
			int tid2 = resultSet.getInt("tid");

			return new Team(tid2);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public void putManager(Member m) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			int mid = m.getMID();
			int tid = m.getTID();
			String name = m.getName();

			preparedStatement = connect.prepareStatement("insert into  TEAMDB.TeamMember values (?, -1, ?, null, null, null)");
			preparedStatement.setInt(1, mid);
			preparedStatement.setString(2, name);
			preparedStatement.executeUpdate();

			if(tid != -1){
				preparedStatement = connect.prepareStatement("UPDATE Teams SET manager = ? WHERE tid = ?");
				preparedStatement.setInt(1, mid);
				preparedStatement.setInt(2, tid);
				preparedStatement.executeUpdate();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}
	
	public void assignManager(Team t) throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
			
			int tid = t.getTID();
			int mid = t.getMID();
			
			preparedStatement = connect.prepareStatement("UPDATE TeamMember SET tid = ? WHERE mid = ?");
			preparedStatement.setInt(1, tid);
			preparedStatement.setInt(2, mid);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}
	
	public void unassignManager(int managerid) throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
						
			preparedStatement = connect.prepareStatement("UPDATE TeamMember SET tid = -1 WHERE mid = ?");
			preparedStatement.setInt(1, managerid);
			
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}

	public Member getMember(int mid) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			preparedStatement = connect.prepareStatement("SELECT * FROM TeamMember WHERE mid = ?");
			preparedStatement.setInt(1, mid);
			resultSet = preparedStatement.executeQuery();

			resultSet.next();
			int mid2 = resultSet.getInt("mid");
			int tid2 = resultSet.getInt("tid");
			String name = resultSet.getString("name");
			String phone = resultSet.getString("phone");
			String email = resultSet.getString("email");
			String tasks = resultSet.getString("tasks");

			Member m = new Member(mid2, tid2, name, phone, email, tasks);

			return m;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}

	public ArrayList<Member> getMembers(int tid) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			preparedStatement = connect.prepareStatement("SELECT * FROM TeamMember WHERE tid = ?");
			preparedStatement.setInt(1, tid);
			resultSet = preparedStatement.executeQuery();

			ArrayList<Member> m = new ArrayList<Member>();

			while (resultSet.next()) {
				int mid2 = resultSet.getInt("mid");
				int tid2 = resultSet.getInt("tid");
				String name = resultSet.getString("name");
				String phone = resultSet.getString("phone");
				String email = resultSet.getString("email");
				String tasks = resultSet.getString("tasks");

				m.add(new Member(mid2, tid2, name, phone, email, tasks));
			}

			return m;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}

	public void addMember(Member m) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			int mid = m.getMID();
			int tid = m.getTID();
			String name = m.getName();

			preparedStatement = connect.prepareStatement("INSERT INTO TEAMDB.TeamMember VALUES(?, -1, ?, null, null, null)");
			preparedStatement.setInt(1, mid);
			preparedStatement.setString(2, name);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}

	public void putMemberIntoTeam(Member m, Team t) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			int mid = m.getMID();
			int tid = t.getTID();

			preparedStatement = connect.prepareStatement("UPDATE TEAMDB.TeamMember SET TID = ? WHERE MID = ?");
			preparedStatement.setInt(1, tid);
			preparedStatement.setInt(2, mid);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}
	
	public void unassignMember(int mid) throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
			
			preparedStatement = connect.prepareStatement("UPDATE TeamMember SET tid = -1 WHERE mid = ?");
			preparedStatement.setInt(1, mid);
			
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}

	public void putMemberContactInfo(Member m) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			int mid = m.getMID();
			String phone = m.getPhone();
			String email = m.getEmail();

			preparedStatement = connect
					.prepareStatement("UPDATE TEAMDB.TeamMember SET phone = ?, email = ? WHERE MID = ?");
			preparedStatement.setString(1, phone);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, mid);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}

	public void removeMember(int mid) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");

			preparedStatement = connect.prepareStatement("DELETE FROM TEAMDB.TeamMember WHERE mid = ?");
			preparedStatement.setInt(1, mid);
			preparedStatement.executeUpdate();
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			close();
		}
	}
	
	public void endTask(int taskid)throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
			
			preparedStatement = connect.prepareStatement("UPDATE TEAMDB.TASKS SET completed = ? WHERE taskID = ?");
			preparedStatement.setInt(1, 1);
			preparedStatement.setInt(2, taskid);
			preparedStatement.executeUpdate();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw e;
		}finally{
			close();
		}
		
	}
	
	public void assignTask(Task t, Member m)throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
			
			String employees = t.getEmployees() + ", " + m.getMID();
			
			preparedStatement = connect.prepareStatement("UPDATE TEAMDB.TASKS SET mid = ? WHERE taskID = ?");
			preparedStatement.setString(1, employees);
			preparedStatement.setInt(2, t.getTaskid());
			preparedStatement.executeUpdate();
			
			String tasks = m.getTasks();
			
			preparedStatement = connect.prepareStatement("UPDATE TEAMDB.TeamMember SET tasks = ? WHERE mid = ?");
			preparedStatement.setString(1, tasks);
			preparedStatement.setInt(2, m.getMID());
			preparedStatement.executeUpdate();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw e;
		}finally{
			close();
		}
		
	}
	
	public Task getTask(int taskid)throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
			
			preparedStatement = connect.prepareStatement("SELECT * FROM TEAMDB.TASKS WHERE taskID = ?");
			preparedStatement.setInt(1, taskid);
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			String desc, date, employees;
			int completed;
			int tid;
			
			desc = resultSet.getString("description");
			date = resultSet.getString("duedate");
			employees = resultSet.getString("mid");
			completed = resultSet.getInt("completed");	
			tid = resultSet.getInt("tid");
			
			Task t = new Task(taskid, desc, date, employees, completed, tid);
			
			return t;
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw e;
		}finally{
			close();
		}
	}
	
	public void createTaskForTeam(Task ts, int teamid)throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "test", "test1");
			
			int taskid = ts.getTaskid();
			String desc = ts.getDesc();
			String date = ts.getDate();
			
			preparedStatement = connect.prepareStatement("INSERT INTO TEAMDB.TASKS VALUES(?, ?, ?, null, 0, ?)");
			preparedStatement.setInt(1, taskid);
			preparedStatement.setString(2, desc);
			preparedStatement.setString(3, date);
			preparedStatement.setInt(4, teamid);
			preparedStatement.executeUpdate();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw e;
		}finally{
			close();
		}
		
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
