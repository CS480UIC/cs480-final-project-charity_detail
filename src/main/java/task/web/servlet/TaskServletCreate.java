package task.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import task.domain.Task;
import task.service.TaskException;
import task.service.TaskService;


/**
 * Servlet implementation class UserServlet
 */

public class TaskServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServletCreate() {
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
		TaskService taskservice = new TaskService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Task form = new Task();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
//			System.out.println(info.add(values[0]));

		}
		System.out.println(info);
//		System.out.println(info);

		form.setName(info.get(0));
//		System.out.println("1");

		form.setCampaign_id(Integer.parseInt(info.get(1)));
//		System.out.println("2");

		form.setDescription(info.get(2));
		
		form.setNumber_of_participants(Integer.parseInt(info.get(3)));
		
		
		try {
			System.out.println("3");
			taskservice.create(form);
			request.setAttribute("msg", "Task Created");
			request.getRequestDispatcher("/jsps/main.jsp").forward(request, response);			
		} catch (ClassNotFoundException | TaskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
