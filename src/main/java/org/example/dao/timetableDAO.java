package org.example.dao;

import org.example.model.Route;
import org.example.model.TimetableRow;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class timetableDAO implements abstractDAO<TimetableRow> {
    private Connection connection;
    private ResultSet resSet;
    private PreparedStatement prepStatement;

    @Override
    public List<TimetableRow> readAll() {
        String requestStr = "SELECT * FROM timetable INNER JOIN routes ON timetable.routeID = routes.routeID;";
        ArrayList<TimetableRow> timetable = new ArrayList<>();

        try{
            connection = ConnectionFactory.getConnection();
            prepStatement = connection.prepareStatement(requestStr);
            resSet = prepStatement.executeQuery();

            while (resSet.next()){
                Route route = new Route(Integer.parseInt(resSet.getString("routes.routeID")),
                        resSet.getString("cityFrom"), resSet.getString("cityTo"),
                        LocalTime.parse(resSet.getString("departureTime")),
                        LocalTime.parse(resSet.getString("arrivalTime")));

                TimetableRow timetableRow = new TimetableRow(Integer.parseInt(resSet.getString("rowID")),
                        route, LocalDate.parse(resSet.getString("departureDate")),
                        LocalDate.parse(resSet.getString("arrivalDate")),
                        Integer.parseInt(resSet.getString("platformNumber")),
                        resSet.getString("trainID"));

                timetable.add(timetableRow);

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
        return timetable;
    }
}
