package queries.service;

import java.util.List;

import queries.dao.DonationSummaryDao;
import queries.domain.DonationSummary;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class DonationSummaryService {
	private DonationSummaryDao donationsummaryDao = new DonationSummaryDao();
	
	
	
	public List<Object> findallDonationSummary() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return donationsummaryDao.DonationSummary();
		
	}
}
