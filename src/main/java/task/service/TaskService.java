package task.service;

import task.dao.TaskDao;
import task.domain.Task;
import task.service.TaskException;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class TaskService {
	private TaskDao taskDao = new TaskDao();
	
	/**
	 * Register a user
	 */
	public void create(Task form) throws TaskException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		taskDao.add(form);
	}
}
