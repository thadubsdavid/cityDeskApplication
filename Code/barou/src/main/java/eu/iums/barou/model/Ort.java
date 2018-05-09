package eu.iums.barou.model;

import javax.xml.stream.Location;

public class Ort {

    private Location koordinaten;
    private String name;

    public Location getKoordinaten() {
        return koordinaten;
    }

    public void setKoordinaten(Location koordinaten) {
        this.koordinaten = koordinaten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
