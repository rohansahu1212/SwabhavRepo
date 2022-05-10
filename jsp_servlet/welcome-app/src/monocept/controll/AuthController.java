package monocept.controll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/auth")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		
	    String savedUsername = "rohan";
	    String savedPassword = "rohan1212";

	    if(request.getParameter("username").equals(savedUsername) && request.getParameter("userPassword").equals(savedPassword)){
	        out.println("<h1>Authentication successful</h1>");
	        out.println("<h2>"+savedUsername+" has successfully logged in</h2>");
	        
	    }
	    else{
	        out.println("<h1>Authentication failed</h1>");

	        out.println("<a href=\"index.html\">Click here for login</a>");
	    }
		
		out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
