package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

@WebServlet("/dashboard")
public class DashboardSevlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		
		PrintWriter  out= resp.getWriter();
		resp.setContentType("text/html");
		
		Cookie c[]=req.getCookies();
		boolean found=  false;
		
		if(c!=null)
		{
			for(int i=0;  i<c.length; i++) {
				Cookie ck=c[i];
				if(ck.getName().contentEquals("registered") && ck.getValue()!=null) {
					out.println("user Found "+ck.getValue()+"<br>");
					found=true;
					 
				}
			}
		}
		if(!found) {
			out.print("user is not registered");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	

}