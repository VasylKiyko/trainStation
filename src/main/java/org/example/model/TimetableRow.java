package org.example.model;

import java.time.LocalDate;

public class TimetableRow {
    private int rowID;
    private Route route;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private int platformNumber;
    private String trainID;


    public TimetableRow(int rowID, Route route,
                        LocalDate departureDate, LocalDate arrivalDate, int platformNumber, String trainID) {
        this.rowID = rowID;
        this.route = route;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.platformNumber = platformNumber;
        this.trainID = trainID;
    }

    public int getRowID() { return rowID;}

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }
}
