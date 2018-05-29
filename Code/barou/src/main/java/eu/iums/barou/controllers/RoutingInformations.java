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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class RoutingInformations extends eu.iums.barou.model.Verkehrsmittel {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private Pane pane_greenHintergrundVerb1;

    @FXML
    private TextField text_Verbindung1;

    @FXML
    private TextField text_Uhrzeit1;

    @FXML
    private TextField text_VonNach1;

    @FXML
    private TextField text_Verkehrsmittel1;

    @FXML
    private ImageView image_Info;

    @FXML
    private Button button_Info1;

    @FXML
    private Pane pane_greenHintergrunVerb2;

    @FXML
    private TextField text_Verbindung2;

    @FXML
    private TextField text_Uhrzeit2;

    @FXML
    private TextField text_VonNach2;

    @FXML
    private TextField text_Verkehrsmittel2;

    @FXML
    private Button button_Info2;

    @FXML
    private Pane pane_greenHintergrundVerb3;

    @FXML
    private TextField text_Verbindung3;

    @FXML
    private TextField text_Uhrzeit3;

    @FXML
    private TextField text_VonNach3;

    @FXML
    private TextField text_Verkehrsmittel3;

    @FXML
    private Button button_Info3;

    @FXML
    private Pane pane_greenHintergrundVerb4;

    @FXML
    private TextField text_Verbindung4;

    @FXML
    private TextField text_Uhrzeit4;

    @FXML
    private TextField text_VonNach4;

    @FXML
    private TextField text_Verkehrsmittel4;

    @FXML
    private Button button_Info4;

    @FXML
    private Pane pane_greenHintergrundPfeillinks;

    @FXML
    private ImageView image_Pfeillinks;

    @FXML
    private Button button_Pfeillinks;

    @FXML
    private Pane pane_greenHintergrundPfeilrechts;

    @FXML
    private ImageView image_Pfeilrechts;

    @FXML
    private Button button_Pfeilrechts;

    @FXML
    private AnchorPane anchorpane_greenbar;

    @FXML
    private Group button_group_Suche;

    @FXML
    private ImageView image_Suche;

    @FXML
    private Label label_Suche;

    @FXML
    private Button button_Suche;

    @FXML
    private Group button_group_Filter;

    @FXML
    private ImageView image_Filter;

    @FXML
    private Label label_Filter;

    @FXML
    private Button button_Filter;

    @FXML
    private Group button_group_Einschränkungen;

    @FXML
    private ImageView image_Einschränkung;

    @FXML
    private Label label_Einschränkung;

    @FXML
    private Button button_Einschränkung;

    @FXML
    private Group button_group_Route;

    @FXML
    private ImageView image_Route;

    @FXML
    private Label label_Route;

    @FXML
    private Button button_Route;

    @FXML
    private Group button_group_Home;

    @FXML
    private ImageView image_Home;

    @FXML
    private Label label_Home;

    @FXML
    private Button button_Home;

    @FXML
    private Group button_group_Sprache;

    @FXML
    private ImageView image_Sprache;

    @FXML
    private Label label_Sprache;

    @FXML
    private Button button_Sprache;

    @FXML
    private Group button_group_Hilfe;

    @FXML
    private ImageView image_Hilfe;

    @FXML
    private Label Label_Hilfe;

    @FXML
    private Button button_Hilfe;

    @FXML
    private Group button_group_Zurück;

    @FXML
    private Rectangle rechteck_greenzurück;

    @FXML
    private ImageView image_Zurück;

    @FXML
    private Button button_Zurück;

    public String Uhr1;
    public String Uhr2;
    public String Linie1;
    public String Linie2;


    public void Name () {

        Uhr1=getUhrzeit1();
        Linie1=getLinie1();
        text_Uhrzeit1.setText(Uhr1);
        text_Verkehrsmittel1.setText(Linie1);
    }


    //Button-Events werden erstellt
    public void buttonPressedBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Route.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedInfo1(ActionEvent actionEvent) {

    }

    public void buttonPressedSearch(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Search.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedFilter(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Filter.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    public void buttonPressedLimitations(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Informations.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    public void buttonPressedRoute(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Route.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        }


    public void buttonPressedHome(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../ButtonBar.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    public void buttonPressedLanguage(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Language.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    public void buttonPressedHelp(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Help.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

}

    public void buttonPressedLeft(ActionEvent actionEvent) {
    }

    public void buttonPressedRight(ActionEvent actionEvent) {
    }

    public void buttonPressedAnzeigen(ActionEvent actionEvent) {
        Name();
    }
}
