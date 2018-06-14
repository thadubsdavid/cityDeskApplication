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

public class Home {

    @FXML
    private AnchorPane anchorpane_Standard;

    @FXML
    private AnchorPane anchorpane_greenbar;

    /*protected void initialize() {
        anchorpane_greenbar.setVisible(true);

    }*/
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

    //Button-Events werden erstellt
    public void buttonPressedSearch(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Search.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedHelp(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Help.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedLanguage(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Language.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedHome(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Home.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedRoute(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Route.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedLimitations(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Limitation.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void buttonPressedFilter(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../Filter.fxml"));
        Scene scene = new Scene(parent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    public void buttonPressedGastronomie(javafx.event.ActionEvent actionEvent) {

        Filter("Gastronomie");

    }
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

    public void buttonPressedEinkaufen(javafx.event.ActionEvent actionEvent) {
        Filter("Einkaufen");

    }

    public void buttonPressedGesundheit(javafx.event.ActionEvent actionEvent) {
        Filter("Gesundheit");
    }

    public void buttonPressedUnterhaltung(javafx.event.ActionEvent actionEvent) {
        Filter("Unterhaltung");
    }

    public void buttonPressedKultur(javafx.event.ActionEvent actionEvent) {
        Filter("Kultur");
    }

}