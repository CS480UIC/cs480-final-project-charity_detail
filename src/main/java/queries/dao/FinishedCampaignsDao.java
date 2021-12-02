package queries.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import queries.domain.FinishedCampaigns;
import java.sql.Date;


/**
 * DDL functions performed in database
 */
public class FinishedCampaignsDao {
	

	public List<Object> FinishedCampaigns() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/charity","root", "Root@123");
			String sql = "select * from finishedcampaigns";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				FinishedCampaigns finishedcampaigns = new FinishedCampaigns();
				finishedcampaigns.setName(resultSet.getString("name"));
				finishedcampaigns.setCharity_id(Integer.parseInt(resultSet.getString("charity_id")));
				finishedcampaigns.setTarget_region_id(Integer.parseInt(resultSet.getString("target_region_id")));
				finishedcampaigns.setStart_date(Date.valueOf(resultSet.getString("start_date")));
				finishedcampaigns.setEnd_date(Date.valueOf(resultSet.getString("end_date")));
	    		list.add(finishedcampaigns);
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
