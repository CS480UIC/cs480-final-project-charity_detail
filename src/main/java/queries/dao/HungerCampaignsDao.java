package queries.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import queries.domain.HungerCampaigns;
import java.sql.Date;


/**
 * DDL functions performed in database
 */
public class HungerCampaignsDao {
	

	public List<Object> HungerCampaigns() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			String sql = "select * from hungercampaigns";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				HungerCampaigns hungercampaigns = new HungerCampaigns();
				hungercampaigns.setName(resultSet.getString("name"));
				hungercampaigns.setCharity_id(Integer.parseInt(resultSet.getString("charity_id")));
				hungercampaigns.setTarget_region_id(Integer.parseInt(resultSet.getString("target_region_id")));
				hungercampaigns.setStart_date(Date.valueOf(resultSet.getString("start_date")));
				hungercampaigns.setEnd_date(Date.valueOf(resultSet.getString("end_date")));
	    		list.add(hungercampaigns);
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
