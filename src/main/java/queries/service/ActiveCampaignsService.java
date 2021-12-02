package queries.service;

import java.util.List;

import queries.dao.ActiveCampaignsDao;
import queries.domain.ActiveCampaigns;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class ActiveCampaignsService{
	private ActiveCampaignsDao activecampaignsDao = new ActiveCampaignsDao();
	
	
	
	public List<Object> findallActiveCampaigns() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return activecampaignsDao.ActiveCampaigns();
		
	}
}
