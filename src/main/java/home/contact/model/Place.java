package home.contact.model;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class Place {
    private String title;
    private double longitude;
    private double latitude;
    private String description;

    public Place(){}
    public Place(String title){}

    public Place(String title,String  description, double longitude, double latitude) {
        this.title = title;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Place : " +
                "title='" + title + '\'' +
                ", longitude= " + longitude +
                ", latitude= " + latitude +
                ", description= '" + description;
    }
}