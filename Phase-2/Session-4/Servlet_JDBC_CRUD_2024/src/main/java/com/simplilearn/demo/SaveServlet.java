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

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String username=req.getParameter("username");
		
		Connection conn=DBConfig.getConnection();
		
		if(conn!=null) {
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into user(name,email,username) value(?,?,?)");
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, username);
				
				int x=stmt.executeUpdate();
				if(x>0) {
					out.println("Record Inserted Successfully");
					
					//redirect servlet to another servlet
					resp.sendRedirect("fetch");
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
		//super.doPost(req, resp);
		doGet(req, resp);
	}
	
	

}
