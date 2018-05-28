package eu.iums.barou.model;

import com.sothawo.mapjfx.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Ort {

    private ArrayList<Coordinate> Koordinaten;
    private ArrayList<String> Name;

    public ArrayList<Coordinate> getKoordinaten() {
        return Koordinaten;
    }

    public void setKoordinaten(ArrayList<Coordinate> koordinaten) {
        this.Koordinaten = koordinaten;
    }

    public List<String> getName() {
        return Name;
    }

    public void setName(ArrayList<String> name) {
        Name = name;
    }

    public Ort (String Name, Coordinate coordinate){


    }
}
