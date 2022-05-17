package com.monocept.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.UserDTO;

@WebFilter(
		urlPatterns = { "/edit","/deletecon","/addstudent"}, 
		servletNames = { 
				"DeleteController", 
				"AddStudentController"
		})
public class AuthenticationFilter implements Filter {

    public AuthenticationFilter() {
        
    }

	public void destroy() {
		
	}


	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

	
	
		System.out.println("in filter  add  delele");
		HttpServletResponse httpResp = (HttpServletResponse) res;
		HttpServletRequest httpReq = (HttpServletRequest) req;
		
		HttpSession session= httpReq.getSession();
		
		UserDTO dto = (UserDTO) session.getAttribute("login");
		if (dto == null) {
			httpResp.sendRedirect("logincon");
			return;
		}
		
		chain.doFilter(req, res);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
