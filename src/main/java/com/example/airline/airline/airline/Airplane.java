package com.example.airline.airline.airline;

public class Airplane {
    private Long id;
    private String airplaneName;
    private int FeulAmount;
    private String airport;

    public Airplane() {
    }

    public Airplane(Long id, String airplaneName, int feulAmount, String airport) {
        this.id = id;
        this.airplaneName = airplaneName;
        FeulAmount = feulAmount;
        this.airport = airport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public int getFeulAmount() {
        return FeulAmount;
    }

    public void setFeulAmount(int feulAmount) {
        FeulAmount = feulAmount;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }
}
