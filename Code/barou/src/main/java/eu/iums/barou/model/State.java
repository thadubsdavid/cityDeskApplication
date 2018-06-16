package eu.iums.barou.model;

import com.sothawo.mapjfx.Coordinate;
import eu.iums.barou.controllers.Route;
import eu.iums.trias.api.Trip;

import javax.xml.soap.Node;
import java.util.List;


/**
 *
 * Erstelldatum: April 2018
 * Zweck: Get und Set Mehoden erstellen.
 * Verwendung: Wenn Get und Set Methoden aufgerufen werden.
 *
 * @author Annika Roeder
 *
 */
public class State {

    private  static State instance;
    private Coordinate startpunkt;
    private Route route;

    public List<Trip> getTripList() {
        return tripList;
    }

    public void setTripList(List<Trip> tripList) {
        this.tripList = tripList;
    }

    private List<Trip> tripList;

    public static void setInstance(State instance) {
        State.instance = instance;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public List<Node> getPoiListe() {
        return poiListe;
    }

    public void setPoiListe(List<Node> poiListe) {
        this.poiListe = poiListe;
    }

    private List<Node> poiListe;


    private State(){

    }

    public static State getInstance(){
        // immer nur 1 Objekt initialisiert
        if(instance == null){
            instance = new State();
        }
        return instance;
    }

    public Coordinate getStartpunkt() {
        return startpunkt;
    }

    public void setStartpunkt(Coordinate startpunkt) {
        this.startpunkt = startpunkt;
    }

 //   public Ort getOrt () {return ort;}
 //   public void setOrt (Ort ort) {this.ort = ort;}


}
