package org.example.model;


import org.example.dao.ConnectionFactory;

import java.sql.*;

public class UserDao {
    private PreparedStatement prepStatement;
    private ResultSet resSet;
    private Connection connection;

    public User checkUser(String login, String password){
        String sqlString = "SELECT * FROM users WHERE userLogin=(?)";
        User user = null;

        try{
            connection = ConnectionFactory.getConnection();
            prepStatement = connection.prepareStatement(sqlString);
            prepStatement.setString(1, login);
            resSet = prepStatement.executeQuery();

            if(resSet.getString("userPassword").equals(password)){
                user = new User(Integer.parseInt(resSet.getString("userID")),
                        resSet.getString("userSurname"), resSet.getString("userName"),
                        resSet.getString("userLogin"), resSet.getString("userPassword"),
                        resSet.getString("userRole"));
            } else {
                throw new UserNotFoundException("Wrong login or password");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error during check user", e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (prepStatement != null) {
                    prepStatement.close();
                }
                if (resSet != null) {
                    resSet.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        return user;
    }
}
