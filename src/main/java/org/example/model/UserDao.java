package org.example.model;


import java.sql.*;

public class UserDao {
    private static final String url = "jdbc:mysql://localhost:3306/train_station?useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String password = "1111";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection con;

    public User getUser(int id) throws SQLException {
        String sqlString = "SELECT * FROM users WHERE userID=(?);";
        User user = null;
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Creating database connection...");
            con = DriverManager.getConnection(url, USER, password);
            stmt = con.prepareStatement(sqlString);

            stmt.setString(1, Integer.toString(id));

            rs = stmt.executeQuery();


            if(rs.next()){
                user = new User(Integer.parseInt(rs.getString("userID")),
                        rs.getString("userName"), rs.getString("userSurname"),
                        rs.getString("userRole"), rs.getString("userLogin"),
                        rs.getString("userPassword"));
            }

        } catch (Exception e){
            System.out.println(e);
        } finally {
            rs.close();
            stmt.close();
            con.close();
        }

        return user;
    }

    public void addUser(User user){}


}
