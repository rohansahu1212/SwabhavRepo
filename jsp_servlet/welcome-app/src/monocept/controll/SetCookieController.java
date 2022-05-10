package monocept.controll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieController
 */
@WebServlet("/SetCookie")
public class SetCookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SetCookieController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		
	    Cookie cookie = new Cookie("color","#4287f5");
	    cookie.setMaxAge(60*60*24);

	    response.addCookie(cookie);

	    out.println("<h2>Cookie set successfully</h2>");

	    out.println("<a href=\"GetCookie\">View cookie</a>");
	    
	    out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}