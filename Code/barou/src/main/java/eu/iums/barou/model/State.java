package eu.iums.barou.model;

import com.sothawo.mapjfx.Coordinate;
import eu.iums.barou.controllers.Route;

public class State {

    private  static State instance;
    private Coordinate startpunkt;
//    private Ort ort;
    private Route route;


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
