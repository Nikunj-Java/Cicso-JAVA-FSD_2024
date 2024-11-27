package com.simplilearn.demo;
 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/airlines")
public class AirlineListServlet extends HttpServlet {
    private AirlineService airlineService = new AirlineService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Fetch airline list
        List<Airline> airlines = airlineService.getAirlines();

        // Set response content type
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        // Build HTML response
        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<!DOCTYPE html>");
        htmlResponse.append("<html><head><title>Airline List</title></head><body>");
        htmlResponse.append("<h1>Available Airlines</h1>");

        if (airlines.isEmpty()) {
            htmlResponse.append("<p>No airlines available.</p>");
        } else {
            htmlResponse.append("<table border='1'>");
            htmlResponse.append("<tr><th>Name</th><th>Origin</th><th>Destination</th><th>Price</th></tr>");
            for (Airline airline : airlines) {
            	htmlResponse.append("<tr>");
            	htmlResponse.append("<td>").append(airline.getName()).append("</td>");
            	htmlResponse.append("<td>").append(airline.getOrigin()).append("</td>");
            	htmlResponse.append("<td>").append(airline.getDestination()).append("</td>");
            	htmlResponse.append("<td>").append(airline.getPrice()).append("</td>");

            	// Add ticket booking form for each airline
            	htmlResponse.append("<td>");
            	htmlResponse.append("<form action='bookTicket' method='POST'>");
            	htmlResponse.append("<input type='hidden' name='airlineId' value='").append(airline.getId()).append("'>");
            	htmlResponse.append("<input type='hidden' name='price' value='").append(airline.getPrice()).append("'>");
            	htmlResponse.append("<input type='number' name='quantity' min='1' max='10' value='1' required>");
            	htmlResponse.append("<input type='submit' value='Book Ticket'>");
            	htmlResponse.append("</form>");
            	htmlResponse.append("</td>");

            	htmlResponse.append("</tr>");

            }
            htmlResponse.append("</table>");
        }

        htmlResponse.append("</body></html>");

        // Write HTML to response
        resp.getWriter().write(htmlResponse.toString());
    }
}
