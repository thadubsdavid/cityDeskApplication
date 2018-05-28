package eu.iums.barou.controllers;

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

    protected void buttonPressed(){
        String text = text_SucheEingabe.getText();
        text_SucheEingabe.setText(text);
        text_SucheEingabe.clear();
    }

    @FXML
    private ListView<?> listview_Suche;

    //Button-Events werden erstellt
    public void pressButtonBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../ButtonBar.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
