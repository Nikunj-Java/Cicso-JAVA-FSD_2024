package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createBatch")
public class CreateBatchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String time=req.getParameter("time");
		String nop=req.getParameter("nop");
		
		Connection conn=DBConfigJDBC.getConnection();
		
		if(conn!=null) {
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into zumba(name,time,nop) value(?,?,?)");
				stmt.setString(1, name);
				stmt.setString(2, time);
				stmt.setString(3, nop);
				
				int x=stmt.executeUpdate();
				if(x>0) {
					out.println("Record Inserted Successfully");
					
					 
					//resp.sendRedirect("fetch");
				}else {
					out.println("Error While Inserting Data");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
}
