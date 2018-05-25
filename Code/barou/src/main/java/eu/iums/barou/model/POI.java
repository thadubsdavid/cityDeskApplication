package eu.iums.barou.model;

import javax.xml.stream.Location;
import java.awt.*;
import java.util.List;

public class POI extends Ort {

    private Location Koordinaten;
    private List<String> Name;
    private Boolean Barrierefreiheit;
    private String Adresse;
    private Integer Oeffnungszeiten;
    private Image Bild;
    private Integer Kosten;
    private Character Befahrbarkeit;
    private String Bewertung;
    private Character Linien;

    @Override
    public Location getKoordinaten() {
        return Koordinaten;
    }

    @Override
    public void setKoordinaten(Location koordinaten) {
        Koordinaten = koordinaten;
    }
/*
    @Override
    public List<String> getName() {
        return Name;
    }

    public void setName(List<String> name) {
        Name = name;
    }
*/
    public Boolean getBarrierefreiheit() {
        return Barrierefreiheit;
    }

    public void setBarrierefreiheit(Boolean barrierefreiheit) {
        Barrierefreiheit = barrierefreiheit;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public Integer getOeffnungszeiten() {
        return Oeffnungszeiten;
    }

    public void setOeffnungszeiten(Integer oeffnungszeiten) {
        Oeffnungszeiten = oeffnungszeiten;
    }

    public Image getBild() {
        return Bild;
    }

    public void setBild(Image bild) {
        Bild = bild;
    }

    public Integer getKosten() {
        return Kosten;
    }

    public void setKosten(Integer kosten) {
        Kosten = kosten;
    }

    public Character getBefahrbarkeit() {
        return Befahrbarkeit;
    }

    public void setBefahrbarkeit(Character befahrbarkeit) {
        Befahrbarkeit = befahrbarkeit;
    }

    public String getBewertung() {
        return Bewertung;
    }

    public void setBewertung(String bewertung) {
        Bewertung = bewertung;
    }

    public Character getLinien() {
        return Linien;
    }

    public void setLinien(Character linien) {
        Linien = linien;
    }
}
