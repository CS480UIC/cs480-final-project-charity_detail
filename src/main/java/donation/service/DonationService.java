package donation.service;

import donation.dao.DonationDao;
import entity1.dao.Entity1Dao;
import donation.domain.Donation;
import donation.service.DonationException;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class DonationService {
	private DonationDao donationDao = new DonationDao();
	
	/**
	 * Register a user
	 */
public void create(Donation form) throws DonationException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		donationDao.add(form);
	}
}
