package eu.iums.barou.model;

import com.sothawo.mapjfx.Coordinate;

import javax.xml.stream.Location;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class POI extends Ort {

    private ArrayList<Coordinate> Koordinaten;
    private ArrayList<String> Name;
    private Boolean Barrierefreiheit;
    private String Adresse;
    private Integer Oeffnungszeiten;
    private Image Bild;
    private Integer Kosten;
    private Character Befahrbarkeit;
    private String Bewertung;
    private Character Linien;

    @Override
    public ArrayList<Coordinate> getKoordinaten() {
        return Koordinaten;
    }

    @Override
    public void setKoordinaten(ArrayList<Coordinate> koordinaten) {
        Koordinaten = koordinaten;
    }

    @Override
    public ArrayList<String> getName() {
        return Name;
    }

    public void setName(ArrayList<String> name) {
        Name = name;
    }

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

    public POI (String name, Coordinate coordinate){
        super(name,coordinate);
    }
}
