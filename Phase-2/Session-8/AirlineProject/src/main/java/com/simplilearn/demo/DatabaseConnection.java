package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/airlines"; // Replace with your database URL
    private static final String USER = "root"; // Replace with your database username
    private static final String PASSWORD = "Nikunj@123"; // Replace with your database password

    // Static method to get a database connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure the MySQL JDBC driver is in your classpath
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Database Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error establishing database connection!");
            e.printStackTrace();
        }
        return connection;
    }
}
