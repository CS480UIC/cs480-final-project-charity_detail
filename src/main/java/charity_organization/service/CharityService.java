package charity_organization.service;

import charity_organization.dao.CharityDao;
//import entity1.dao.Entity1Dao;
import charity_organization.domain.Charity;
import charity_organization.service.CharityException;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class CharityService {
	private CharityDao charityDao = new CharityDao();
	
	/**
	 * Register a user
	 */
public void create(Charity form) throws CharityException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
	charityDao.add(form);
	}
}
