package eu.iums.barou.model;

public class Bus extends Verkehrsmittel {

    private Float LaengeinKM;
    private Boolean Barrierefreiheit;

    public Float getLaengeinKM() {
        return LaengeinKM;
    }

    public void setLaengeinKM(Float laengeinKM) {
        LaengeinKM = laengeinKM;
    }

    @Override
    public Boolean getBarrierefreiheit() {
        return Barrierefreiheit;
    }

    @Override
    public void setBarrierefreiheit(Boolean barrierefreiheit) {
        Barrierefreiheit = barrierefreiheit;
    }
}
