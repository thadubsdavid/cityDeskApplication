package eu.iums.barou.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Verbindung {

    private Haltestellen Start;
    private Haltestellen Ziel;
    private ZonedDateTime Ankunftszeit;
    private ZonedDateTime Abfahrtszeit;
    private Haltestellen zwischenhalt;
    private List<Haltestellen> Umstiege;
    private Double Preis;
    private List<Integer> waben;
    private List<Strecke> teilstrecke;

    public Haltestellen getStart() {
        return Start;
    }

    public void setStart(Haltestellen start) {
        Start = start;
    }

    public Haltestellen getZiel() {
        return Ziel;
    }

    public void setZiel(Haltestellen ziel) {
        Ziel = ziel;
    }

    public ZonedDateTime getAnkunftszeit() {
        return Ankunftszeit;
    }

    public void setAnkunftszeit(ZonedDateTime ankunftszeit) {
        Ankunftszeit = ankunftszeit;
    }

    public ZonedDateTime getAbfahrtszeit() {
        return Abfahrtszeit;
    }

    public void setAbfahrtszeit(ZonedDateTime abfahrtszeit) {
        Abfahrtszeit = abfahrtszeit;
    }

    public Haltestellen getZwischenhalt() {
        return zwischenhalt;
    }

    public void setZwischenhalt(Haltestellen zwischenhalt) {
        this.zwischenhalt = zwischenhalt;
    }

    public List<Haltestellen> getUmstiege() {
        return Umstiege;
    }

    public void setUmstiege(List<Haltestellen> umstiege) {
        Umstiege = umstiege;
    }

    public Double getPreis() {
        return Preis;
    }

    public void setPreis(Double preis) {
        Preis = preis;
    }

    public List<Integer> getWaben() {
        return waben;
    }

    public void setWaben(List<Integer> waben) {
        this.waben = waben;
    }

    public List<Strecke> getTeilstrecke() {
        return teilstrecke;
    }

    public void setTeilstrecke(List<Strecke> teilstrecke) {
        this.teilstrecke = teilstrecke;
    }


}
