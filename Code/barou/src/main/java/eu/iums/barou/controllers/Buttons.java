package eu.iums.barou.controllers;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;

public class Buttons {

    //Buttons
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

    //Zurück-Button
    @FXML
    private Group button_group_Zurück;

    @FXML
    private Rectangle rechteck_greenzurück;

    @FXML
    private ImageView image_Zurück;

    @FXML
    private Button button_Zurück;

    //Help
    @FXML
    private Pane pane_greenhelp;

    @FXML
    private Label label_Bedienungshinweise;

    //InfoDialog
    @FXML
    private Pane pane_InfoDialog;

    @FXML
    private Pane pane_greenÜberschriftInfoDialog;

    @FXML
    private TextField text_ZoologischerStadtgarte;

    @FXML
    private Button button_RouteDialog;

    @FXML
    private TextField text_InfosBarrierefreiheit;

    @FXML
    private TextField text_InfosPOI;

    @FXML
    private ImageView image_Zoo;

    @FXML
    private ImageView image_Bahn;

    @FXML
    private ImageView image_Fuß;

    @FXML
    private ImageView image_pin;

    //Informations
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

    //Language
    @FXML
    private Button button_Deutsch;

    @FXML
    private Button button_English;

    @FXML
    private Button button_Francais;

    //POI
    @FXML
    private ImageView image_marker;

    //Route
    @FXML
    private Pane pane_greenHintergrundRouteEingabe;

    @FXML
    private Label label_Von;

    @FXML
    private TextField text_KaHbf;

    @FXML
    private Label label_Nach;

    @FXML
    private TextField text_ZielEingeben;

    //RoutingInformation
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

    //Search
    @FXML
    private Pane pane_greenHintergrundSuche;

    @FXML
    private ImageView image_Suche2;

    @FXML
    private TextField text_SucheEingabe;

    @FXML
    private ListView<?> listview_Suche;

    //Start
    //nichts

    //Filter
    //Categories
    @FXML
    private Button button_Gastronomie;

    @FXML
    private Button button_Einkaufen;

    @FXML
    private Button button_Gesundheit;

    @FXML
    private Button button_Kultur;

    @FXML
    private Button button_Unterhaltung;

    //Culture
    @FXML
    private Button button_GastronomieLight;

    @FXML
    private Button button_EinkaufenLight;

    @FXML
    private Button button_GesundheitLight;

    @FXML
    private Button button_UnterhaltungLight;

    @FXML
    private Group button_group_KulturOben;

    @FXML
    private Button button_ParksOben;

    @FXML
    private Button button_KunstOben;

    @FXML
    private Button button_GeschichtlichesOben;

    @FXML
    private Button button_MuseumOben;

    @FXML
    private Group button_group_KulturUnten;

    @FXML
    private Button button_KunstUnten;

    @FXML
    private Button button_GeschichtlichesUnten;

    @FXML
    private Button button_ParksUnten;

    @FXML
    private Button button_MuseumUnten;

    //Entertainment
    @FXML
    private Button button_KulturLight;

    @FXML
    private Group button_group_UnterhaltungOben;

    @FXML
    private Button button_SchwimmbadOben;

    @FXML
    private Button button_ZooOben;

    @FXML
    private Button button_TheaterOben;

    @FXML
    private Button button_KinoOben;

    @FXML
    private Group button_group_UnterhaltungUnten;

    @FXML
    private Button button_TheaterUnten;

    @FXML
    private Button button_ZooUnten;

    @FXML
    private Button button_SchwimmbadUnten;

    @FXML
    private Button button_KinoUnten;

    //Gastronomy
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

    //Health
    @FXML
    private Group button_group_GesundheitOben;

    @FXML
    private Button button_FitnessOben;

    @FXML
    private Button button_TherapieOben;

    @FXML
    private Button button_ApothekeOben;

    @FXML
    private Button button_ArztOben;

    @FXML
    private Button button_KrankenhausOben;

    @FXML
    private Group button_group_GesundheitUnten;

    @FXML
    private Button button_ArztUnten;

    @FXML
    private Button button_ApothekeUnten;

    @FXML
    private Button button_TherapieUnten;

    @FXML
    private Button button_KrankenhausUnten;

    @FXML
    private Button button_FitnessUnten;

    //Shopping
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


}
