package eu.iums.barou.controllers;

import akka.dispatch.japi;
import akka.japi.JAPI;
import eu.iums.trias.api.LocationInformationRequestPayload;
import eu.iums.wheelmap.api.API;
import eu.iums.wheelmap.api.RequestModel;
import eu.iums.wheelmap.api.Wheelchair;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.BoundingBox;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.w3c.dom.traversal.NodeFilter;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public class Route {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private AnchorPane anchorpane_greenbar;

    @FXML
    private Pane pane_greenHintergrundRouteEingabe;

    @FXML
    private Label label_Von;

    @FXML
    private TextField text_KaHbf;

    @FXML
    private Label label_Nach;

    @FXML
    private TextField text_ZielEingeben;

    @FXML
    private Group button_group_Route;

    @FXML
    private ImageView image_Route;

    @FXML
    private Label label_Route;

    @FXML
    private Button button_Route;

    //Button-Events werden erstellt
    public void buttonPresssedBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Home.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    private String text;
    public String Uhrzeit1;
    public Integer Uhrzeit2;
    public Integer Uhrzeit3;
    public Integer Uhrzeit4;
    public String Linie1;
    public String Linie2;
    public String Linie3;
    public String Linie4;



    public void buttonPressedRoute(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../RoutingInformations.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();


        }


    //Bei Texteingabe der Haltestelle Verbindung auswählen


    //Abrufen einer gefilterten Liste von Knoten


    public void Filter() {
        RequestModel.NodeFilter filter = new RequestModel.NodeFilter()
                .withBoundingBox(
                        new RequestModel.BoundingBox(8.308718, 48.957036, 8.490356, 49.109496))
                .withWheelchair(Wheelchair.Yes)
                .withSearchQuery("Karlsruhe");
        API.nodes(filter).whenComplete((response, error) -> {
            if (response != null) System.out.println(response);
            else error.printStackTrace();
        });
    }


/*
    public void InformationRequest () {
        CompletionStage response;
        response = JAPI.locationInformationRequest(new LocationInformationRequestPayload("Karlsruhe, hoffstrasse 3"));
        response.whenComplete((result, error) -> {
            if (result != null) System.out.println(result);
            else error.printStackTrace();
        });
    }

   */
/*
    public void Trip () {
        TripRequestPayload tripRequestPayload = new TripRequestPayload(
                new LocationContext(LocationRef.withStopPlaceRef("de:08212:7003"), Optional.empty()),
                new LocationContext(LocationRef.withStopPlaceRef("de:08212:90"), Optional.of(ZonedDateTime.now())),
                new TripParams()
                        .withPtModeFilter(new PtModeFilterStructure()
                                .withPtMode(PtModesEnumeration.TRAM, PtModesEnumeration.BUS))
                        .withNoElevator(true)
                        .withIncludeFares(true)
        );
        CompletionStage response =
                JAPI.tripRequest(tripRequestPayload);
        response.whenComplete((result, error) -> {
            if (result != null) System.out.println(result);
            else error.printStackTrace();
        });
    }

*/
}



