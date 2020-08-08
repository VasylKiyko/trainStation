package org.example.model;

import java.util.List;

public interface Model {
    List<TimetableRow> getTimetable();
    List<Route> getAllRoutes();

    User checkUser(String login, String password);
}
