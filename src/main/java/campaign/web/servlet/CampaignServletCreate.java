package campaign.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campaign.domain.Campaign;
import campaign.service.CampaignException;
import campaign.service.CampaignService;


/**
 * Servlet implementation class UserServlet
 */

public class CampaignServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CampaignServletCreate() {
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
		CampaignService campaignservice = new CampaignService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Campaign form = new Campaign();
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

//		System.out.println("1");

		form.setCharity_id(Integer.parseInt(info.get(0)));
//		System.out.println("2");

		form.setName(info.get(1));
		
		form.setStart_date(info.get(2));
		
		form.setTarget_region_id(Integer.parseInt(info.get(3)));
		
		form.setEnd_date(info.get(4));
		
		try {
			System.out.println("3");
			campaignservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | CampaignException e) {
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
