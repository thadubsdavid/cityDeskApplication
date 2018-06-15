package eu.iums.barou.controllers;

import eu.iums.wheelmap.api.API;
import eu.iums.wheelmap.api.RequestModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


/**
 *
 * Erstelldatum: April 2018
 * Zweck: Zum suchen von Zielen mit Texteingabe.
 * Verwendung: Wenn Suchen-Button betaetigt wurde.
 *
 * @author David Adam
 */
public class Search {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private AnchorPane anchorpane_greenbar;

    @FXML
    private Pane pane_greenHintergrundSuche;

    @FXML
    private ImageView image_Suche2;

    @FXML
    private TextField text_SucheEingabe;

    @FXML
    private Button button_back;

    @FXML
    private ListView<?> listview_Suche;


    // Klassenspezifische Buttons:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Zum suchen von Zielen mit Texteingabe.
     * Verwendung: Bei Klick auf den Suchen-Button.
     *
     * @author David Adam
     *
     */
    protected void buttonPressed(){
        String text = text_SucheEingabe.getText();
        text_SucheEingabe.setText(text);
        text_SucheEingabe.clear();
    }

    /**
     *
     * Erstelldatum: Juni 2018
     * Zweck: Zum suchen von Zielen mit Texteingabe.
     * Verwendung: Bei Klick auf den Suchen-Button.
     *
     * @author David Adam
     *
     */
    public void Category () {
        RequestModel.CategoryFilter filter = new RequestModel.CategoryFilter()
                .withLocale("de");
        API.categories(filter).whenComplete((response, error) -> {
            if (response != null) System.out.println(response);
            else error.printStackTrace();
        });
    }


    //Zurueck-Button

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Zum Home Menue zurueckkehren.
     * Verwendung: Wenn der Zurueck-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author David Adam
     *
     */
    public void pressButtonBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Home.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
