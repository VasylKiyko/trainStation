package org.example.model;

import org.example.dao.abstractDAO;
import org.example.dao.routeDAO;
import org.example.dao.timetableDAO;

import java.util.List;

public class Domain {

    public List<TimetableRow> getTimetable(){
        abstractDAO<TimetableRow> absDAO = new timetableDAO();
        List<TimetableRow> timetable = null;
        try {
            timetable = absDAO.readAll();
        } catch (Exception e) {
            throw new RuntimeException("Error while reading timetable", e);
        }
        return timetable;
    }

    public List<Route> getAllRoutes(){
        abstractDAO<Route> absDAO = new routeDAO();
        List<Route> routesList = null;
        try {
            routesList = absDAO.readAll();
        } catch (Exception e) {
            throw new RuntimeException("Error while reading routes", e);
        }
        return routesList;
    }
}
