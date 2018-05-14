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

public class Gastronomy {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private Button button_EinkaufenLight;

    @FXML
    private Button button_GesundheitLight;

    @FXML
    private Button button_KulturLight;

    @FXML
    private Button button_UnterhaltungLight;

    @FXML
    private Group button_group_GastronomieOben;

    @FXML
    private Button button_ImbissOben;

    @FXML
    private Button button_RestaurantOben;

    @FXML
    private Button button_BarOben;

    @FXML
    private Button button_CafeOben;

    @FXML
    private Group button_group_GastronomieUnten;

    @FXML
    private Button button_BarUnten;

    @FXML
    private Button button_RestaurantUnten;

    @FXML
    private Button button_ImbissUnten;

    @FXML
    private Button button_CafeUnten;

    @FXML
    private Button button_Gastronomie;

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

    public void buttonPressedShopping(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Shopping.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    public void buttonPressedHealth(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Health.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedCulture(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Culture.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedEntertainment(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Entertainment.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedImbiss(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Imbiss.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedRestaurant(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Restaurant.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedBar(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Bar.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedCafe(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Cafe.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedGastronomy(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Gastronomy.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
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

    public void buttonPressedSprache(ActionEvent actionEvent) throws IOException {
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

    public void buttonPressedBack(ActionEvent actionEvent) throws IOException {

        Parent parent = FXMLLoader.load(getClass().getResource("../ButonBar.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}