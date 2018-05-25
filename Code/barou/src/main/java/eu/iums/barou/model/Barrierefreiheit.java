package eu.iums.barou.model;

public class Barrierefreiheit extends POI {

    private String Einschraenkung;
    private Boolean Treppe;
    private Boolean Fahrstuhl;
    private Boolean Rolltreppe;
    private Boolean Niederflurwagen;

    public String getEinschraenkung() {
        return Einschraenkung;
    }

    public void setEinschraenkung(String einschraenkung) {
        Einschraenkung = einschraenkung;
    }

    public Boolean getTreppe() {
        return Treppe;
    }

    public void setTreppe(Boolean treppe) {
        Treppe = treppe;
    }

    public Boolean getFahrstuhl() {
        return Fahrstuhl;
    }

    public void setFahrstuhl(Boolean fahrstuhl) {
        Fahrstuhl = fahrstuhl;
    }

    public Boolean getRolltreppe() {
        return Rolltreppe;
    }

    public void setRolltreppe(Boolean rolltreppe) {
        Rolltreppe = rolltreppe;
    }

    public Boolean getNiederflurwagen() {
        return Niederflurwagen;
    }

    public void setNiederflurwagen(Boolean niederflurwagen) {
        Niederflurwagen = niederflurwagen;
    }
}
