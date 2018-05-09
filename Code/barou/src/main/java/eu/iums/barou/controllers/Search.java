package eu.iums.barou.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

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

    protected void buttonPressed(){
        String text = text_SucheEingabe.getText();
        text_SucheEingabe.setText(text);
        text_SucheEingabe.clear();
    }

    @FXML
    private ListView<?> listview_Suche;


}
