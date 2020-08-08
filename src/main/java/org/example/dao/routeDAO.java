package org.example.dao;

import org.example.model.Route;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class routeDAO implements abstractDAO<Route> {
    private Connection connection;
    private ResultSet resSet;
    private PreparedStatement prepStatement;


    @Override
    public List<Route> readAll() {
        String requestStr = "SELECT * FROM routes;";
        ArrayList<Route> routes = new ArrayList<>();

        try{
            connection = ConnectionFactory.getConnection();
            prepStatement = connection.prepareStatement(requestStr);
            resSet = prepStatement.executeQuery();

            while(resSet.next()){
                Route route = new Route(Integer.parseInt(resSet.getString("routeID")),
                        resSet.getString("cityFrom"), resSet.getString("cityTo"),
                        LocalTime.parse(resSet.getString("departureTime")),
                        LocalTime.parse(resSet.getString("arrivalTime")));
                routes.add(route);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error with database", e);
        } finally {
            try{
                if(connection != null){connection.close();}
                if(prepStatement != null){prepStatement.close();}
                if(resSet != null){resSet.close();}
            } catch (SQLException e){
                System.out.println(e);
            }

        }
        return routes;
    }
}
