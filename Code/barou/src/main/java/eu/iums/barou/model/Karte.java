package eu.iums.barou.model;

import javax.xml.stream.Location;
import java.time.ZonedDateTime;
import java.awt.*;

public class Karte {

    private Location Koordinate;
    private ZonedDateTime Uhrzeit;
    private Image Karte;

    public Location getKoordinate() {
        return Koordinate;
    }

    public void setKoordinate(Location koordinate) {
        Koordinate = koordinate;
    }

    public ZonedDateTime getUhrzeit() {
        return Uhrzeit;
    }

    public void setUhrzeit(ZonedDateTime uhrzeit) {
        Uhrzeit = uhrzeit;
    }

    public Image getKarte() {
        return Karte;
    }

    public void setKarte(Image karte) {
        Karte = karte;
    }
}
