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

public class Shopping {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private Button button_GastronomieLight;

    @FXML
    private Button button_GesundheitLight;

    @FXML
    private Button button_KulturLight;

    @FXML
    private Button button_UnterhaltungLight;

    @FXML
    private Group button_group_EinkaufenOben;

    @FXML
    private Button button_DrogerieOben;

    @FXML
    private Button button_KleidungOben;

    @FXML
    private Button button_BioLadenOben;

    @FXML
    private Button button_BäckerMetzgerOben;

    @FXML
    private Button button_LebensmittelOben;

    @FXML
    private Group button_group_EinkaufenUnten;

    @FXML
    private Button button_BäckerMetzgerUnten;

    @FXML
    private Button button_BioLadenUnten;

    @FXML
    private Button button_KleidungUnten;

    @FXML
    private Button button_LebensmittelUnten;

    @FXML
    private Button button_DrogerieUnten;

    @FXML
    private Button button_Einkaufen;

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

    //Button-Events werden erstellt
    public void buttonPressedGastronomie(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Gastronomy.fxml"));
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

    public void buttonPressedDrogerie(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Drogerie.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedKleider(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Kleider.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedBioLaden(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../BioLaden.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedMetzger(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Metzger.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedFood(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Lebensmittel.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedSearch(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Suche.fxml"));
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

    public void buttonPressedLimitation(ActionEvent actionEvent) throws IOException {
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

    public void buttonPressedBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../ButtonBar.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
