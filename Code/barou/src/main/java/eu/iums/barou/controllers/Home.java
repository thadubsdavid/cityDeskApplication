package eu.iums.barou.controllers;

        import eu.iums.barou.App;
        import eu.iums.wheelmap.api.API;
        import eu.iums.wheelmap.api.RequestModel;
        import eu.iums.wheelmap.api.Wheelchair;
        import javafx.embed.swing.JFXPanel;
        import javafx.event.EventHandler;
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
        import javafx.stage.Stage;

        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.io.IOException;


/**
 *
 * Erstelldatum: April 2018
 * Zweck: Home-Ansicht bedienen.
 * Verwendung: Bei Start und nach klicken auf den Home-Button.
 *
 * @author Seline Winkelmann
 *
  */
public class Home {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private AnchorPane anchorpane_greenbar;

    @FXML
    private Parent mapView;

    private MapController mapController;

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
    public Button button_Sprache;

    @FXML
    private Group button_group_Hilfe;

    @FXML
    private ImageView image_Hilfe;

    @FXML
    private Label Label_Hilfe;

    @FXML
    private Button button_Hilfe;

    @FXML
    protected void initialize(){
    }


    //Deklarierte Methoden:

    /**
     *
     * Erstelldatum: Mai 2018
     * Zweck: Filtern.
     * Verwendung: --
     *
     * @param Text
     * @author Seline Winkelmann
     *
     */
    public void Filter(String Text) {
        RequestModel.NodeFilter filter = new RequestModel.NodeFilter()
                .withBoundingBox(
                        new RequestModel.BoundingBox(8.308718, 48.957036, 8.490356, 49.109496))
                .withWheelchair(Wheelchair.Yes)
                .withSearchQuery(Text);
        API.nodes(filter).whenComplete((response, error) -> {
            if (response != null) System.out.println(response);

            else error.printStackTrace();
        });
    }


    //Buttons der Button-Bar:

    /**
     *
     * Erstelldatum: April 2018
     * Zweck: Den Suchen-View oeffnen .
     * Verwendung: Wenn der Suchen-Button betaetigt wird.
     *
     * @param actionEvent
     * @throws IOException
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedSearch(javafx.event.ActionEvent actionEvent) throws IOException {
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
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedFilter(javafx.event.ActionEvent actionEvent) throws IOException {
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
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedLimitations(javafx.event.ActionEvent actionEvent) throws IOException {
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
     * @throws IOException4
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedRoute(javafx.event.ActionEvent actionEvent) throws IOException {
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
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedHome(javafx.event.ActionEvent actionEvent) throws IOException {
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
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedLanguage(javafx.event.ActionEvent actionEvent) throws IOException {
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
     * @author Seline Winkelmann
     *
     */
    public void buttonPressedHelp(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Help.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}


//Methoden die eventuell gebruacht werden:

/*
    public void pressButtonSearch (javafx.event.ActionEvent actionEvent) throws IOException {
        /**FXMLLoader fxmlSearch = new FXMLLoader(getClass().getResource("Search.fxml"));
        fxmlSearch.setRoot(this);
        fxmlSearch.setController(this);*/
//Parent root = FXMLLoader.load(getClass().getResource("Search.fxml"));

/*
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Search.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    protected void initialize () {
        button_Sprache.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                getClass().getResource("Language.fxml");
            }
        });
    }

    @ FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        //button_Sprache.setOnAction(event1 -> getClass().getResource("Language.fxml"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Search.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }*/