package com.sulaiman.busreservation.Buses;

import java.time.LocalDate;
import java.time.LocalTime;


public class Bus {
    private Long busNumber;
    private String source;
    private String destination;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private String fare;
    private int capacity;

//Empty Constructor
    public Bus() {
    }

    //Constructor with Parameters
    public Bus(Long busNumber,
               String source,
               String destination,
               LocalTime departureTime,
               LocalTime arrivalTime,
               LocalDate arrivalDate,
               LocalDate departureDate,
               String fare,
               int capacity) {
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.fare = fare;
        this.capacity = capacity;
    }


    //Constructor without id
    public Bus(String source,
               String destination,
               LocalTime departureTime,
               LocalTime arrivalTime,
               LocalDate arrivalDate,
               LocalDate departureDate,
               String fare,
               int capacity) {
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.fare = fare;
        this.capacity = capacity;
    }

    //Getters and Setters

    public Long getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Long busNumber) {
        this.busNumber = busNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //ToString method
    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                ", fare='" + fare + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}