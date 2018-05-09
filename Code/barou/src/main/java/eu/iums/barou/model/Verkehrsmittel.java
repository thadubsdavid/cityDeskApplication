package eu.iums.barou.model;

public class Verkehrsmittel extends Strecke {

    private String name;
    private Haltestellen linienverlauf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Haltestellen getLinienverlauf() {
        return linienverlauf;
    }

    public void setLinienverlauf(Haltestellen linienverlauf) {
        this.linienverlauf = linienverlauf;
    }



}
