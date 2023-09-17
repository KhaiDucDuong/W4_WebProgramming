package surveyProject;
import surveyProject.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailListServlet
 */
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String url ="/index.html";
        
        String action = request.getParameter("action");
        if(action == null)
        {
            action = "join";
        }  
        
        if(action.equals("join"))
        {
            url = "/index.html";
        }
        else if(action.equals("add"))
        {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");
            String hearOption = request.getParameter("hearOption");
            Boolean isAnnoucement = false;
            Boolean isEmailAnnoucement = false;
            String[] isAnnoucements = request.getParameterValues("annoucement");
            for (String s : isAnnoucements)
            {
            	if(s.equals("annoucement"))
            	{
            		isAnnoucement = true;
            	}
            	if(s.equals("emailAnnoucement"))
            	{
            		isEmailAnnoucement = true;
            	}
            }
            
            String contactOption = request.getParameter("contactOptions");
            
            User user = new User(firstName, lastName, email, dateOfBirth, hearOption,
            		isAnnoucement, isEmailAnnoucement, contactOption);
            //UserDB.insert(user);
            
            request.setAttribute("user",user);
            url = "/thanks.jsp";
            
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
	}

}
