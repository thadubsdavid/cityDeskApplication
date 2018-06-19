package eu.iums.barou.controllers;

import eu.iums.barou.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * Erstelldatum: April 2018
 * Zweck: Zum auswaehlen des Einschraenkungsgrads.
 * Verwendung: Wenn auf den Einschraenkungsgrad-Button geklickt wurde.
 *
 * @author Annika Roeder
 *
 */
public class Limitation {

    @FXML
    private Parent mapView;

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private Pane pane_greenHintergrundInformations;

    @FXML
    private CheckBox checkbox_Treppe;

    @FXML
    private CheckBox checkbox_Aufzüge;

    @FXML
    private CheckBox checkbox_Rolltreppe;

    @FXML
    private CheckBox checkbox_Niederflurfahrzeuge;

    @FXML
    private CheckBox checkbox_Einstiegshilfe;

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


    //Zurueck-Button:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Zum Home Menue zurueckkehren.
     * Verwendung: Wenn der Zurueck-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedBack(ActionEvent actionEvent) {
        try {
            App.getInstance().showHome();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Buttons der Button-Bar:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Suchen-View oeffnen .
     * Verwendung: Wenn der Suchen-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedSearch(ActionEvent actionEvent) {
        try {
            App.getInstance().showSearch();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Filter-View oeffnen .
     * Verwendung: Wenn der Filter-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void butttonPressedFilter(ActionEvent actionEvent) {
        try {
            App.getInstance().showFilter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Einschraenkungsgrad-View oeffnen .
     * Verwendung: Wenn der Einschraenkungsgrad-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedLimitation(ActionEvent actionEvent) {
        try {
            App.getInstance().showLimitation();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Routen-View oeffnen .
     * Verwendung: Wenn der Routen-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedRoute(ActionEvent actionEvent) {
        try {
            App.getInstance().showRoute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Home-View oeffnen .
     * Verwendung: Wenn der Home-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedHome(ActionEvent actionEvent) {
        try {
            App.getInstance().showHome();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Sprachauswahl-View oeffnen .
     * Verwendung: Wenn der Sprachauswahl-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedLanguage(ActionEvent actionEvent) {
        try {
            App.getInstance().showLanguage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Hilfe-View oeffnen .
     * Verwendung: Wenn der Hilfe-Button betaetigt wird.
     *
     * @param actionEvent
     * @author Annika Roeder
     *
     */
    public void buttonPressedHelp(ActionEvent actionEvent) {
        try {
            App.getInstance().showHelp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
