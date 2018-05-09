package eu.iums.barou.model;

import javax.xml.stream.Location;

public class Haltestellen extends Ort {

    private Location Koordinaten;
    private String name;
    private Boolean Barrierefreiheit;

    @Override
    public Location getKoordinaten() {
        return Koordinaten;
    }

    @Override
    public void setKoordinaten(Location koordinaten) {
        Koordinaten = koordinaten;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBarrierefreiheit() {
        return Barrierefreiheit;
    }

    public void setBarrierefreiheit(Boolean barrierefreiheit) {
        Barrierefreiheit = barrierefreiheit;
    }


}
