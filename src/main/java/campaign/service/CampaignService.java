package campaign.service;

import campaign.dao.CampaignDao;
import campaign.domain.Campaign;
import campaign.service.CampaignException;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class CampaignService {
	private CampaignDao campaignDao = new CampaignDao();
	
	/**
	 * Register a user
	 */
	public void create(Campaign form) throws CampaignException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		campaignDao.add(form);
	}
}
