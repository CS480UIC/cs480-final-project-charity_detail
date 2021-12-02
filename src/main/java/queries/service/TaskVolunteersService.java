package queries.service;

import java.util.List;

import queries.dao.TaskVolunteersDao;
import queries.domain.TaskVolunteers;

/**
 * logic functions such as register, login
 * @author  Judhajit
 */
public class TaskVolunteersService{
	private TaskVolunteersDao taskvolunteersDao = new TaskVolunteersDao();
	
	
	
	public List<Object> findallTaskVolunteers() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return taskvolunteersDao.TaskVolunteers();
		
	}
}
