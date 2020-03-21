package pl.rynski.coronavirusmap.model;

public class Point {

    private String country;
    private double lat;
    private double lon;
    private String confirmed;

    public Point() {
    }

    public Point(String country, double lat, double lon, String confirmed) {
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.confirmed = confirmed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }
}
