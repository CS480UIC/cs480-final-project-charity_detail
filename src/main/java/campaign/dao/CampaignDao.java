package campaign.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import campaign.domain.Campaign;

/**
 * DDL functions performed in database
 */
public class CampaignDao {

	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Campaign form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are in task");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "insert into campaign values(NULL, ?, ?, ?, ?, ?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql);
		    preparestatement.setLong(1,form.getCharity_id());
		    preparestatement.setString(2,form.getName());
		    preparestatement.setString(3,form.getStart_date());
		    preparestatement.setLong(4,form.getTarget_region_id());
		    preparestatement.setString(5,form.getStart_date());
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
			
			String sql = "delete from campaign where id = ?";
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

	public void update(Campaign form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "UPDATE campaign SET name = ? where id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setLong(1,form.getId());
			preparestatement.setString(2,form.getName());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
