package charity_organization.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import charity_organization.domain.Charity;
/**
 * DDL functions performed in database
 */
public class CharityDao {

	public static Charity findByid(String id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Charity charity = new Charity();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
		    String sql = "select * from charity_organization where id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,id);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String user_name = resultSet.getString("id");
		    	if(user_name.equals(id)){
		    		charity.setId(Integer.parseInt(resultSet.getString("id")));
		    		charity.setName(resultSet.getString("name"));
		    		charity.setCause(resultSet.getString("cause"));
		    		charity.setAddress(resultSet.getString("address"));
		    		charity.setTarget_region_id(Integer.parseInt(resultSet.getString("target_region_id")));	
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return charity;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Charity form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here donation");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "insert into charity_organization (id,name,cause,address,target_region_id) values (?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getId());
		    preparestatement.setString(2,form.getName());
		    preparestatement.setString(3,form.getCause());
		    preparestatement.setString(4,form.getAddress());
		    preparestatement.setInt(5,form.getTarget_region_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Charity form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update donation");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "UPDATE charity_organization SET name = ?, cause = ?,address = ?,target_region_id = ? where id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(5,form.getId());
		    preparestatement.setString(1,form.getName());
		    preparestatement.setString(2,form.getCause());
		    preparestatement.setString(3,form.getAddress());
		    preparestatement.setInt(4,form.getTarget_region_id());
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
			
			String sql = "delete from charity_organization where id = ?";
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
