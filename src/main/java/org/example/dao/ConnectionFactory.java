package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static final String url = "jdbc:mysql://localhost:3306/train_station?useUnicode=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String password = "1111";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection(){
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Creating database connection...");
            return DriverManager.getConnection(url, USER, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Error connection to database", e);
        }

    }
}
