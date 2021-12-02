package task_status.service;

import task_status.dao.TaskDao;
import task_status.domain.Task;
import task_status.service.TaskException;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 */
public class TaskService {
	private TaskDao taskstatusDao = new TaskDao();
	
	/**
	 * Register a user
	 */
	public void create(Task form) throws TaskException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		taskstatusDao.add(form);
	}
}
