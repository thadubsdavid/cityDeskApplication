package eu.iums.barou.model;

import javax.xml.stream.Location;
import java.util.List;

public class POI extends Ort {

    private Location Koordinaten;
    private List<String> name;
    private Boolean Barrierefreiheit;
/*
    @Override
    public Location getKoordinaten() {
        return Koordinaten;
    }

    @Override
    public void setKoordinaten(Location koordinaten) {
        Koordinaten = koordinaten;
    }

    @Override
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public Boolean getBarrierefreiheit() {
        return Barrierefreiheit;
    }

    public void setBarrierefreiheit(Boolean barrierefreiheit) {
        Barrierefreiheit = barrierefreiheit;
    }

*/

}
