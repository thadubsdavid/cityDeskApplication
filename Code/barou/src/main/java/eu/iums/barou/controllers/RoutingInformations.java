package eu.iums.barou.controllers;

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


/**
 *
 * Erstelldatum: April 2018
 * Zweck: Aktion bei betaetigen des Zurueck-Buttons.
 * Verwendung: Wenn Zurueck-Button betaetigt wird.
 *
 * @author Markus Linnartz
 *
 */
public class RoutingInformations {

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


    // Klassenspezifische Buttons:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Aktion bei betaetigen des mittleren Info-Buttons.
     * Verwendung: Wenn der Info-Button betaetigt wird.
     *
     * @param actionEvent
     */
    public void buttonPressedInfo1(ActionEvent actionEvent) {
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Aktion bei betaetigen des linken Info-Buttons.
     * Verwendung: Wenn linker Info-Button betaetigt wird.
     *
     * @param actionEvent
     */
    public void buttonPressedLeft(ActionEvent actionEvent) {
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Aktion bei betaetigen des rechten Info-Buttons.
     * Verwendung: Wenn rechter Info-Button betaetigt wird.
     *
     * @param actionEvent
     */
    public void buttonPressedRight(ActionEvent actionEvent) {
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Aktion bei betaetigen des Anzeigen-Buttons.
     * Verwendung: Wenn der Anzeigen-Button betaetigt wird.
     *
     * @param actionEvent
     */
    public void buttonPressedAnzeigen(ActionEvent actionEvent) {
    }


    // Zurueck Button:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Zum Home Menue zurueckkehren.
     * Verwendung: Wenn der Zurueck-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Route.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    //Buttons auf der Button-Bar:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Suchen-View oeffnen .
     * Verwendung: Wenn der Suchen-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedSearch(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Search.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Filter-View oeffnen .
     * Verwendung: Wenn der Filter-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedFilter(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Filter.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Einschraenkungsgrad-View oeffnen .
     * Verwendung: Wenn der Einschraenkungsgrad-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedLimitations(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Limitation.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Routen-View oeffnen .
     * Verwendung: Wenn der Routen-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedRoute(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Route.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Home-View oeffnen .
     * Verwendung: Wenn der Home-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedHome(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Home.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Sprachauswahl-View oeffnen .
     * Verwendung: Wenn der Sprachauswahl-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedLanguage(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Language.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Hilfe-View oeffnen .
     * Verwendung: Wenn der Hilfe-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     */
    public void buttonPressedHelp(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Help.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}