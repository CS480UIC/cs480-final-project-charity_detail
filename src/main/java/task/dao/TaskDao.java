package task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.util.ArrayList;
//import java.util.List;

import task.domain.Task;

/**
 * DDL functions performed in database
 */
public class TaskDao {

	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Task form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are in task");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "insert into task values(NULL,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getName());
		    preparestatement.setInt(2,form.getCampaign_id());
		    preparestatement.setString(3,form.getDescription());
		    preparestatement.setInt(4,form.getNumber_of_participants());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Task form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "UPDATE task SET description = ?, number_of_participants = ? where id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getDescription());
			preparestatement.setLong(2,form.getNumber_of_participants());
		    preparestatement.setLong(3,form.getId());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void delete(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "delete from task where id = ?";
			System.out.println(id);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,id);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
//
	public void initialize() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			try {
			String sql = "create table test(id int)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.executeUpdate();
		    connect.close();
			}catch(Exception e) {
				String sql = "drop table test";
				PreparedStatement preparestatement = connect.prepareStatement(sql); 
			    preparestatement.executeUpdate();
			    sql = "create table test(id int)";
			    PreparedStatement preparestatement2 = connect.prepareStatement(sql);
			    preparestatement2.executeUpdate();
			    connect.close();

			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public static Task findByid(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Task task = new Task();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
		    String sql = "select * from task where id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,id);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String user_name = resultSet.getString("id");
		    	if(user_name.equals(id)){
		    		task.setId(Integer.parseInt(resultSet.getString("id")));
		    		task.setName(resultSet.getString("name"));
		    		task.setCampaign_id(Integer.parseInt(resultSet.getString("campaign_id")));
		    		task.setDescription(resultSet.getString("description"));
		    		task.setNumber_of_participants(Integer.parseInt(resultSet.getString("number_of_participants")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return task;
	}	
}
