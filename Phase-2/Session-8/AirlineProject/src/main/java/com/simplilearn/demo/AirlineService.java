package com.simplilearn.demo;
 

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AirlineService {
    public List<Airline> getAirlines() {
        List<Airline> airlines = new ArrayList<>();
        String query = "SELECT * FROM airlines"; 
        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Airline airline = new Airline();
                airline.setId(rs.getInt("id"));
                airline.setName(rs.getString("name"));
                airline.setOrigin(rs.getString("origin"));
                airline.setDestination(rs.getString("destination"));
                airline.setPrice(rs.getDouble("price"));
                airlines.add(airline);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return airlines;
    }
}