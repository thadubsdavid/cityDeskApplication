package eu.iums.barou.model;

public class Verkehrsmittel extends Strecke {

    private String Name;
    private Haltestellen Linienverlauf;

    @Override
    public String getName() {
        return Name;
    }

    @Override
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
