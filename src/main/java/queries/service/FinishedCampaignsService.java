package queries.service;

import java.util.List;

import queries.dao.FinishedCampaignsDao;
import queries.domain.FinishedCampaigns;

/**
 * logic functions such as register, login
 * @author  Judhajit
 */
public class FinishedCampaignsService{
	private FinishedCampaignsDao finishedcampaignsDao = new FinishedCampaignsDao();
	
	
	
	public List<Object> findallFinishedCampaigns() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return finishedcampaignsDao.FinishedCampaigns();
		
	}
}
