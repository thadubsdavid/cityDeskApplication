package eu.iums.barou.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Verbindung  {

    private Haltestellen Abfahrtsort;
    private Haltestellen Ankunftsort;
    private ZonedDateTime Abfahrtszeit;
    private ZonedDateTime Ankunftszeit;
    private ZonedDateTime Fahrtdauer;
    private Haltestellen Zwischenhalte;
    private List<Haltestellen> Umstiege;
    private List<Integer> Waben;
    private List<Strecke> Teilstrecke;
    private List<Float> Preis;

    public Haltestellen getAbfahrtsort() {
        return Abfahrtsort;
    }

    public void setAbfahrtsort(Haltestellen abfahrtsort) {
        Abfahrtsort = abfahrtsort;
    }

    public Haltestellen getAnkunftsort() {
        return Ankunftsort;
    }

    public void setAnkunftsort(Haltestellen ankunftsort) {
        Ankunftsort = ankunftsort;
    }

    public ZonedDateTime getAbfahrtszeit() {
        return Abfahrtszeit;
    }

    public void setAbfahrtszeit(ZonedDateTime abfahrtszeit) {
        Abfahrtszeit = abfahrtszeit;
    }

    public ZonedDateTime getAnkunftszeit() {
        return Ankunftszeit;
    }

    public void setAnkunftszeit(ZonedDateTime ankunftszeit) {
        Ankunftszeit = ankunftszeit;
    }

    public ZonedDateTime getFahrtdauer() {
        return Fahrtdauer;
    }

    public void setFahrtdauer(ZonedDateTime fahrtdauer) {
        Fahrtdauer = fahrtdauer;
    }

    public Haltestellen getZwischenhalte() {
        return Zwischenhalte;
    }

    public void setZwischenhalte(Haltestellen zwischenhalte) {
        Zwischenhalte = zwischenhalte;
    }

    public List<Haltestellen> getUmstiege() {
        return Umstiege;
    }

    public void setUmstiege(List<Haltestellen> umstiege) {
        Umstiege = umstiege;
    }

    public List<Integer> getWaben() {
        return Waben;
    }

    public void setWaben(List<Integer> waben) {
        Waben = waben;
    }

    public List<Strecke> getTeilstrecke() {
        return Teilstrecke;
    }

    public void setTeilstrecke(List<Strecke> teilstrecke) {
        Teilstrecke = teilstrecke;
    }

    public List<Float> getPreis() {
        return Preis;
    }

    public void setPreis(List<Float> preis) {
        Preis = preis;
    }

}
