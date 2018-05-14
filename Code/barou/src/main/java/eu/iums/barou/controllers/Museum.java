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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Museum {

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

    @FXML
    private Button button_MuseumOben;


   public void buttonPressedBack(ActionEvent event) throws IOException {
       Parent parent = FXMLLoader.load(getClass().getResource("../Entertainment.fxml"));
       Scene scene = new Scene(parent);

       Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
       window.setScene(scene);
       window.show();

    }

    @FXML
    void buttonPressedFilter(ActionEvent event) {

    }

    @FXML
    void buttonPressedHelp(ActionEvent event) {

    }

    @FXML
    void buttonPressedHome(ActionEvent event) {

    }

    @FXML
    void buttonPressedLanguage(ActionEvent event) {

    }

    @FXML
    void buttonPressedLimitation(ActionEvent event) {

    }

    @FXML
    void buttonPressedMuseumm(ActionEvent event) {

    }

    @FXML
    void buttonPressedRoute(ActionEvent event) {

    }



    public void buttonPressedSearch(ActionEvent actionEvent) {
    }
}
