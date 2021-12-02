package donation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import donation.domain.Donation;
/**
 * DDL functions performed in database
 */
public class DonationDao {

	public static Donation findBydonorname(String donor_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Donation donation = new Donation();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
		    String sql = "select * from donation where donor_name=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,donor_name);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String user_name = resultSet.getString("donor_name");
		    	if(user_name.equals(donor_name)){
		    		donation.setdonor_name(resultSet.getString("donor_name"));
		    		donation.setcharity_id(resultSet.getString("charity_id"));
		    		donation.setdonation_amount(resultSet.getString("donation_amount"));		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return donation;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Donation form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here donation");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "insert into donation (id,donor_name,charity_id,donation_amount) values (?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getId());
		    preparestatement.setString(2,form.getdonor_name());
		    preparestatement.setString(3,form.getcharity_id());
		    preparestatement.setString(4,form.getdonation_amount());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Donation form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update donation");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "UPDATE donation SET donor_name = ?, charity_id = ?,donation_amount = ? where donor_name = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setString(1,form.getdonor_name());
		    preparestatement.setString(2,form.getcharity_id());
		    preparestatement.setString(3,form.getdonation_amount());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "delete from donation where donor_name = ?";
			System.out.println(username);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,username);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void initialize() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("We are here donation");
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
}
