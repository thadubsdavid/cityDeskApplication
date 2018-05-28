package eu.iums.barou.model;

import java.util.ArrayList;
import java.util.List;

public class Verkehrsmittel extends Strecke {

    private String Name;
    private Haltestellen Linienverlauf;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Haltestellen getLinienverlauf() {
        return Linienverlauf;
    }

    public void setLinienverlauf(Haltestellen linienverlauf) {
        Linienverlauf = linienverlauf;
    }
}
