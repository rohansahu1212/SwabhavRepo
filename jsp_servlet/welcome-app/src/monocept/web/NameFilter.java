package monocept.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/auth")
public class NameFilter implements Filter {

	public NameFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		System.out.println("in filter");
		if (request.getParameter("username").equals("rohan"))
			chain.doFilter(request, response);
		else {
			out.print("your username is not correct you stopped by filter");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
