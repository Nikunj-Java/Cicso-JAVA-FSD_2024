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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		PrintWriter out=resp.getWriter();
		String id=req.getParameter("id");
		int my_id=Integer.parseInt(id);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String username=req.getParameter("username");
		
		Connection conn=DBConfig.getConnection();
		
		if(conn!=null) {
			try {
				PreparedStatement stmt=conn.prepareStatement("update user set name=?,email=?,username=? where id=?");
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, username);
				stmt.setInt(4, my_id);
				
				int x=stmt.executeUpdate();
				if(x>0) {
					out.println("Record Update Successfully");
					
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
