package com.simplilearn.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=resp.getWriter();
		 HttpSession session=req.getSession(false);
		 resp.setContentType("text/html");
		 
		 if(session!=null) {
			 String usernameFromSession=(String) session.getAttribute("key");
			 //out.println("Welcome....! "+usernameFromSession);
			 if(usernameFromSession!=null) {
				 out.println("Welcome....! "+usernameFromSession);
				 out.println("<br><a href='logout'>Logout</a>");
			 }
		 }
		 
		  
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
}
