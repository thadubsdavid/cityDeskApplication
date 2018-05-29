package eu.iums.barou.controllers;

import eu.iums.barou.model.Verbindung;
import eu.iums.barou.model.Verkehrsmittel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.ZonedDateTime;

public class Route extends eu.iums.barou.model.Verkehrsmittel {

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
        Parent parent = FXMLLoader.load(getClass().getResource("../ButtonBar.fxml"));
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

        text = text_ZielEingeben.getText();
       if (text == "Europaplatz") {
            Uhrzeit1="1207";
            Linie1="Tram 3";
            setUhrzeit1(Uhrzeit1);
            setLinie1(Linie1);
        }
    }

    //Bei TExteingabe der Haltestelle Verbindung auswählen




}
