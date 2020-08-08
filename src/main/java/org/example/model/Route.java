package org.example.model;

import java.time.LocalTime;

public class Route {
    private int routeID;
    private String cityFrom;
    private String cityTo;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public Route(int routeID, String cityFrom, String cityTo, LocalTime departureTime, LocalTime arrivalTime) {
        this.routeID = routeID;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeID=" + routeID +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
