package eu.iums.barou.model;

import java.time.ZonedDateTime;

public class Strecke extends Verbindung {

    private Ort Startpunkt;
    private Ort Zielpunkt;
    private ZonedDateTime Startzeit;
    private ZonedDateTime Endzeit;
    private Verkehrsmittel Verkehrsmittel;
    private Float LaengeinM;

    public Ort getStartpunkt() {
        return Startpunkt;
    }

    public void setStartpunkt(Ort startpunkt) {
        Startpunkt = startpunkt;
    }

    public Ort getZielpunkt() {
        return Zielpunkt;
    }

    public void setZielpunkt(Ort zielpunkt) {
        Zielpunkt = zielpunkt;
    }

    public ZonedDateTime getStartzeit() {
        return Startzeit;
    }

    public void setStartzeit(ZonedDateTime startzeit) {
        Startzeit = startzeit;
    }

    public ZonedDateTime getEndzeit() {
        return Endzeit;
    }

    public void setEndzeit(ZonedDateTime endzeit) {
        Endzeit = endzeit;
    }

    public eu.iums.barou.model.Verkehrsmittel getVerkehrsmittel() {
        return Verkehrsmittel;
    }

    public void setVerkehrsmittel(eu.iums.barou.model.Verkehrsmittel verkehrsmittel) {
        Verkehrsmittel = verkehrsmittel;
    }

    public Float getLaengeinM() {
        return LaengeinM;
    }

    public void setLaengeinM(Float laengeinM) {
        LaengeinM = laengeinM;
    }
}
