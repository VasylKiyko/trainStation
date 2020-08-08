package org.example.model;

import java.util.List;

public class BusinessLogic implements Model {
    private Domain domain;

    public BusinessLogic() {
        domain = new Domain();
    }

    @Override
    public List<TimetableRow> getTimetable() {
        return domain.getTimetable();
    }

    @Override
    public List<Route> getAllRoutes() {
        return domain.getAllRoutes();
    }

    @Override
    public User checkUser(String login, String password) {
        return null;
    }
}
