package queries.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import queries.domain.ActiveCampaigns;



/**
 * DDL functions performed in database
 */
public class ActiveCampaignsDao {
	

	public List<Object> ActiveCampaigns() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			String sql = "select * from activecampaigns";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				ActiveCampaigns activecampaigns = new ActiveCampaigns();
				activecampaigns.setId(Integer.parseInt(resultSet.getString("id")));
				activecampaigns.setName(resultSet.getString("name"));
				activecampaigns.setCause(resultSet.getString("cause"));
				activecampaigns.setTarget_region_id(Integer.parseInt(resultSet.getString("target_region_id")));
	    		list.add(activecampaigns);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public void initializeDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			
			String sql = "insert into user values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
}
