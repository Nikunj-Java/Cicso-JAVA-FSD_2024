package com.simplilearn.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/bookTicket")
public class BookTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the booking data from the form
        String airlineId = req.getParameter("airlineId");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");

        
        // You can add logic to save the booking details to the database, send confirmation, etc.

        // Simple confirmation message
        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h2>Booking Confirmed!</h2>");
        resp.getWriter().println("<p>You have successfully booked " + quantity + " tickets for airline ID: " + airlineId + " at ₹" + price + " each.</p>");
        resp.getWriter().println("<a href='airlines'>Back to Airline List</a>");
        resp.getWriter().println("</body></html>");
    }
}
