package task_status.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import task_status.domain.Task;

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
			
			String sql = "insert into task_status values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql);
			preparestatement.setLong(1,form.getID());
		    preparestatement.setString(2,form.getStatus());
		    preparestatement.setString(3,form.getRemark());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
//	public void update(Entity1 form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		System.out.println("Now going to update");
//		System.out.println(form);
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
//			
//			String sql = "UPDATE entity1 SET password = ?, email = ? where username = ?;";
//			System.out.println("Update Executed");
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,form.getPassword());
//			preparestatement.setString(2,form.getEmail());
//		    preparestatement.setString(3,form.getUsername());
//		    preparestatement.executeUpdate();
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//	
//	
	public void delete(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "delete from task_status where id = ?";
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


	public void update(Task form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "UPDATE task_status SET remark = ?, status = ? where id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getRemark());
			preparestatement.setString(2,form.getStatus());
		    preparestatement.setLong(3,form.getID());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
