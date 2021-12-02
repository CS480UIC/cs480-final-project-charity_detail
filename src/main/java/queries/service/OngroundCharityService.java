package queries.service;

import java.util.List;

import queries.dao.OngroundCharityDao;
import queries.domain.OngroundCharity;

/**
 * logic functions such as register, login
 * @author  Judhajit
 */
public class OngroundCharityService{
	private OngroundCharityDao ongroundcharityDao = new OngroundCharityDao();
	
	
	
	public List<Object> findallOngroundCharity() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return ongroundcharityDao.OngroundCharity();
		
	}
}
