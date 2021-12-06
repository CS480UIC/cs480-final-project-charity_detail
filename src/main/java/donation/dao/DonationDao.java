package donation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import donation.domain.Task;
/**
 * DDL functions performed in database
 */
public class DonationDao {

	public static Task findByid(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Task donation = new Task();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
		    String sql = "select * from donation where id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,id);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String user_name = resultSet.getString("id");
		    	if(user_name.equals(id)){
		    		donation.setId(Integer.parseInt(resultSet.getString("id")));
		    		donation.setDonor_name(resultSet.getString("donor_name"));
		    		donation.setCharity_id(Integer.parseInt(resultSet.getString("charity_id")));
		    		donation.setDonation_amount(resultSet.getString("donation_amount"));		
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
	
	public void add(Task form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here donation");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "insert into donation (id,donor_name,charity_id,donation_amount) values (?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getId());
		    preparestatement.setString(2,form.getDonor_name());
		    preparestatement.setInt(3,form.getCharity_id());
		    preparestatement.setString(4,form.getDonation_amount());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Task form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update donation");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "UPDATE donation SET donor_name = ?, charity_id = ?,donation_amount = ? where id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setString(1,form.getDonor_name());
		    preparestatement.setInt(2,form.getCharity_id());
		    preparestatement.setString(3,form.getDonation_amount());
		    preparestatement.setInt(4,form.getId());
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
			
			String sql = "delete from donation where id = ?";
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
