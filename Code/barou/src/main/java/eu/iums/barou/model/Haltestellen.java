package eu.iums.barou.model;

import com.sothawo.mapjfx.Coordinate;
import eu.iums.barou.controllers.Haltestelle;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

public class Haltestellen extends Ort {

    private ArrayList<Coordinate> Koordinaten;
    private ArrayList<String> Name;
    private Boolean Barrierefreiheit;

    @Override
    public ArrayList<Coordinate> getKoordinaten() {
        return Koordinaten;
    }

    @Override
    public void setKoordinaten(ArrayList<Coordinate> koordinaten) {
        Koordinaten = koordinaten;
    }

    @Override
    public ArrayList<String> getName() {
        return Name;
    }

    @Override
    public void setName(ArrayList<String> name) {
        Name = name;
    }

    public Boolean getBarrierefreiheit() {
        return Barrierefreiheit;
    }

    public void setBarrierefreiheit(Boolean barrierefreiheit) {
        Barrierefreiheit = barrierefreiheit;
    }


    public Haltestellen(String name, Coordinate coordinate) {
        super(name,coordinate);
    }
}
