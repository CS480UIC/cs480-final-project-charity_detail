package task_status.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import task_status.domain.Task;
import task_status.service.TaskException;
import task_status.service.TaskService;
import task_status.dao.TaskDao;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class TaskStatusServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskStatusServletUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TaskDao taskstatusdao = new TaskDao();
		
			Map<String,String[]> paramMap = request.getParameterMap();
			Task form = new Task();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
				System.out.println(name + ": " + Arrays.toString(values));
			}
			form.setID(Integer.parseInt(info.get(1)));
			form.setStatus(info.get(2));
			form.setRemark(info.get(3));

			try {
				taskstatusdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Task Status Updated");
			request.getRequestDispatcher("/jsps/main.jsp").forward(request, response);
		}
	
}



