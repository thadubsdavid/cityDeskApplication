package eu.iums.barou.controllers;

import eu.iums.barou.App;
import eu.iums.wheelmap.api.API;
import eu.iums.wheelmap.api.RequestModel;
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

/**
 *
 * Erstelldatum: April 2018
 * Zweck: Nach Kategorien filtern .
 * Verwendung: Wenn der Filter-Button betaetigt wird.
 *
 * @author Vicky-Kromer Schulze
 *
 */
public class Filter {

    @FXML
    private AnchorPane anchorpane_Standard;

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


    //Klassenspezifische Methoden:

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Kategorien filtern .
     * Verwendung: --
     *
     * @author Markus Linnartz
     *
     */
    public void Category (String category) {
        RequestModel.CategoryFilter filter = new RequestModel.CategoryFilter()
                .withLocale("de");
        API.categories(filter).whenComplete((response, error) -> {
            if (response != null) System.out.println(response);
            else error.printStackTrace();
        });
    }


    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Node-Kategorien filtern .
     * Verwendung: Wenn Node-Kategorie ausgewaehlt wurde
     *
     * @param categoryId
     * @author Markus Linnartz
     *
     */
    public void NodeCategory (int categoryId) {
        RequestModel.NodeTypeFilter filter = new RequestModel.NodeTypeFilter()
                .withLocale("de")
                .withCategory(categoryId); // only select node types of a given category
        API.nodeTypes(filter).whenComplete((response, error) -> {
            if (response != null) {
                System.out.println(response);
            } else {
                error.printStackTrace();
            }
        });
    }



    //Filter fuer GASTRONOMIE:

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Restaurants filtern .
     * Verwendung: Wenn Restaurant ausgewaehlt wurde.
     *
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedRestaurant(ActionEvent actionEvent) {
        NodeCategory(23);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Bars filtern .
     * Verwendung: Wenn Bar ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedBar(ActionEvent actionEvent) {
        NodeCategory(22);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Imbiss und FastFood filtern .
     * Verwendung: Wenn Imbiss ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedFastFood(ActionEvent actionEvent) {
        NodeCategory(21);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Biergaerten filtern .
     * Verwendung: Wenn Biergarten ausgewaehlt wurde.
     *
     * @param actionEvent
     */
    public void buttonPressedBiergarten(ActionEvent actionEvent) {
        NodeCategory(25);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Cafes filtern .
     * Verwendung: Wenn Cafe ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedCafe(ActionEvent actionEvent) {
        NodeCategory(18);
    }


    //Filter fuer EINKAUFEN

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Shopping Centern filtern .
     * Verwendung: Wenn ShoppingCenter ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedShoppingCenter(ActionEvent actionEvent) {
        NodeCategory(64);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Supermaerkten filtern .
     * Verwendung: Wenn Supermarkt ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedSupermarket(ActionEvent actionEvent) {
        NodeCategory(68);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Drogeriemaerkten filtern .
     * Verwendung: Wenn Drogerie ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedDrogerie(ActionEvent actionEvent) {
        NodeCategory(69);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Modelaeden filtern .
     * Verwendung: Wenn Kleidung ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedClothes(ActionEvent actionEvent) {
        NodeCategory(51);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Kiosken filtern .
     * Verwendung: Wenn Kiosk ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedKiosk(ActionEvent actionEvent) {
        NodeCategory(65);
    }


    //Filter fuer Gesundheit

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Aerzten filtern .
     * Verwendung: Wenn Arzt ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedDoctor(ActionEvent actionEvent) {
        NodeCategory(107);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Krankenhaus filtern .
     * Verwendung: Wenn Krankenhaus ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedHospital(ActionEvent actionEvent) {
        NodeCategory(108);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Aühotheken filtern .
     * Verwendung: Wenn Aphoteke ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedPharmacie(ActionEvent actionEvent) {
        NodeCategory(109);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Tieraerzten filtern .
     * Verwendung: Wenn Tierarzt ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedPetDoctor(ActionEvent actionEvent) {
        NodeCategory(110);
    }


    //Filter fuer Kultur

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Kunstwerken filtern .
     * Verwendung: Wenn Kunswerk ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedArt(ActionEvent actionEvent) {
        NodeCategory(82);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Schloessern filtern .
     * Verwendung: Wenn Schloss ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedCastle(ActionEvent actionEvent) {
        NodeCategory(85);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Denkmaelern filtern .
     * Verwendung: Wenn Denkmal ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedHitoryPoint(ActionEvent actionEvent) {
        NodeCategory(87);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Aussichtspunkten filtern .
     * Verwendung: Wenn Aussichtspunkt ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedViewPoint(ActionEvent actionEvent) {
        NodeCategory(90);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Sehenswuerdigkeiten filtern .
     * Verwendung: Wenn Sehenwuerdigkeit ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedSight(ActionEvent actionEvent) {
        NodeCategory(83);
    }


    //Filter fuer Unterhaltung

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Schwimmbaedern filtern .
     * Verwendung: Wenn Schwimmbad ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedSwimming(ActionEvent actionEvent) {
        NodeCategory(79);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Kinos filtern .
     * Verwendung: Wenn Kino ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedCinema(ActionEvent actionEvent) {
        NodeCategory(26);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Theatern filtern .
     * Verwendung: Wenn Theater ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedTheater(ActionEvent actionEvent) {
        NodeCategory(29);
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Zoos filtern .
     * Verwendung: Wenn Zoo ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedZoo(ActionEvent actionEvent) {
        Category("Zoo");
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Nach Nachtclubs filtern .
     * Verwendung: Wenn Nachtclub ausgewaehlt wurde.
     *
     * @param actionEvent
     * @author Markus Linnartz
     *
     */
    public void buttonPressedNightClub(ActionEvent actionEvent) {
        NodeCategory(28);
    }


    //Zurueck-Button:

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Zum Home Menue zurueckkehren.
     * Verwendung: Wenn der Zurueck-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtonPressBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Home.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    //Buttons der Button-Bar:

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Suchen-View oeffnen .
     * Verwendung: Wenn der Suchen-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void buttonPressSearch(ActionEvent actionEvent) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("../Search.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Filter-View oeffnen .
     * Verwendung: Wenn der Filter-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtoPressFilter(ActionEvent actionEvent) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("../Filter.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Einschraenkungsgrad-View oeffnen .
     * Verwendung: Wenn der Einschraenkungsgrad-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtonPressLimitations(ActionEvent actionEvent) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("../Limitation.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Routen-View oeffnen .
     * Verwendung: Wenn der Routen-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtonPressRoute(ActionEvent actionEvent) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("../Route.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Home-View oeffnen .
     * Verwendung: Wenn der Home-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtonPressHome(ActionEvent actionEvent) throws IOException {
       Parent parent = FXMLLoader.load(getClass().getResource("../Home.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Sprachauswahl-View oeffnen .
     * Verwendung: Wenn der Sprachauswahl-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtonPressLanguage(ActionEvent actionEvent) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("../Language.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     *
     * Erstelldatum: 15.06.2018
     * Zweck: Den Hilfe-View oeffnen .
     * Verwendung: Wenn der Hilfe-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Markus Linnartz
     *
     */
    public void ButtonPressHelp(ActionEvent actionEvent)throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Help.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
