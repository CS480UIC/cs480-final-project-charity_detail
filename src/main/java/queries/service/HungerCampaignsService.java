package queries.service;

import java.util.List;

import queries.dao.HungerCampaignsDao;
import queries.domain.HungerCampaigns;

/**
 * logic functions such as register, login
 * @author  Judhajit
 */
public class HungerCampaignsService{
	private HungerCampaignsDao hungercampaignsDao = new HungerCampaignsDao();
	
	
	
	public List<Object> findallHungerCampaigns() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return hungercampaignsDao.HungerCampaigns();
		
	}
}
