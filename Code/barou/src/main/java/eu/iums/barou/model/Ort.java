package eu.iums.barou.model;

import javax.xml.stream.Location;

public class Ort {

    private Location Koordinaten;
    private String Name;

    public Location getKoordinaten() {
        return Koordinaten;
    }

    public void setKoordinaten(Location koordinaten) {
        Koordinaten = koordinaten;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
