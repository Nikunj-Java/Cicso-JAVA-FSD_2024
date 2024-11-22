package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchBatch")
public class FetchBatchesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
		// TODO Auto-generated method stub
		 PrintWriter out=resp.getWriter();
		 out.println("Connecting to Database.....");
		 Connection conn=DBConfigJDBC.getConnection();
		 if(conn!=null) {
			 out.println("Connections Established Successfully");
			 Statement stmt;
			 
			 try {
				
				 stmt=conn.createStatement();
				 ResultSet rs=stmt.executeQuery("Select *from zumba");
				 
//				 while(rs.next()) {
//					 out.println("ID: "+rs.getInt(1)+",NAME: "+rs.getString(2)+",Time: "+rs.getString(3)+",USERNAME: "+rs.getString(4));
//				 }
				 resp.setContentType("text/html");
				 out.println("<table border=1 cellpadding=10 cellspacing=0><thead><tr>");
				 out.print("<th>ID</th><th>NAME</th><th>TIME</th><th>NOP</th>");
				 out.print("</tr></thead>");
				 out.print("<tboady>");
				 while(rs.next()) {
					 out.print("<tr>");
					 out.print("<td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>");
					 out.print("</tr>");
					 
				 }
				 
				 out.print("</tbody></table>");
				 
			} catch (SQLException e) {
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
		 else {
			 out.print("Error While Connecting to the Database");
			 }
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
