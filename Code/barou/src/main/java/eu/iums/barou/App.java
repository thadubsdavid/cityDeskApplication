package eu.iums.barou;

import com.sothawo.mapjfx.Coordinate;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * Erstelldatum: April 2018
 * Zweck: Zum Starten der App.
 * Verwendung: Bei Start der App.
 *
 * @author Java
 *
 */
public class App extends javafx.application.Application {


    private static App instance;
    private Scene primaryScene;
    private Parent Home;
    private Parent Search;
    private Parent Filter;
    private Parent Limitation;
    private Parent Route;
    private Parent RoutingInformations;
    private Parent Language;
    private Parent Help;
    private Parent MapView;
    private Parent InfoDialog;



    @FXML
    public Button button_Sprache;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        instance = this;

        Home = new FXMLLoader(App.class.getResource("Home.fxml")).load();
        Search = new FXMLLoader(App.class.getResource("Search.fxml")).load();
        Filter = new FXMLLoader(App.class.getResource("Filter.fxml")).load();
        Limitation = new FXMLLoader(App.class.getResource("Limitation.fxml")).load();
        Route = new FXMLLoader(App.class.getResource("Route.fxml")).load();
        RoutingInformations = new FXMLLoader(App.class.getResource("RoutingInformations.fxml")).load();
        Language = new FXMLLoader(App.class.getResource("Language.fxml")).load();
        Help = new FXMLLoader(App.class.getResource("Help.fxml")).load();
        MapView = new FXMLLoader(App.class.getResource("MapView.fxml")).load();
        InfoDialog = new FXMLLoader(App.class.getResource("InfoDialog.fxml")).load();

        FXMLLoader loader = new FXMLLoader();
        String pfad = "Home.fxml";
        loader.setLocation(getClass().getResource(pfad));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        }


    public void showHome() throws IOException {
        primaryScene.setRoot(Home); }

    public void showSearch() throws IOException {
        primaryScene.setRoot(Search); }

    public void showFilter() throws IOException {
        primaryScene.setRoot(Filter); }

    public void showLimitation() throws IOException {
        primaryScene.setRoot(Limitation); }

    public void showRoute() throws IOException {
        primaryScene.setRoot(Route); }

    public void showRoutingInformations() throws IOException {
        primaryScene.setRoot(RoutingInformations); }

    public void showLanguage() throws IOException {
        primaryScene.setRoot(Language); }

    public void showHelp() throws IOException {
        primaryScene.setRoot(Help); }

    public void showMapView() throws IOException {
        primaryScene.setRoot(MapView); }

    public void showInfoDialog() throws IOException {
        primaryScene.setRoot(InfoDialog); }

    public static App getInstance() {
        return instance;
    }
}






// Eventuell Benoetigte Daten:


   /* public static void main(String[] args) {

        //Hauptbahnhof KA als Startpunkt definiert
        State.getInstance().setStartpunkt(new Coordinate(48.993165,8.400514));

        //POI-Koordinaten definiert
        State.getInstance().setOrt(new Ort("Schloss",new Coordinate(49.013513, 8.404435)));
        State.getInstance().setOrt(new Ort("Ludwigsplatz",new Coordinate(49.0090370, 8.3962174)));
        State.getInstance().setOrt(new Ort("Schlossplatz",new Coordinate(49.010809 , 8.403886)));
        State.getInstance().setOrt(new Ort("VeniceBeach Karlsruhe",new Coordinate(49.0093624, 8.3941599)));
        State.getInstance().setOrt(new Ort("Hof Apotheke",new Coordinate(49.0097743, 8.3968793)));
        State.getInstance().setOrt(new Ort("ZARA",new Coordinate(49.0064326, 8.4021150)));
        State.getInstance().setOrt(new Ort("Rewe City Kaiserstraße",new Coordinate(49.0098935, 8.3919353)));
        State.getInstance().setOrt(new Ort("Back Factory",new Coordinate(49.0102584, 8.3936435)));
        State.getInstance().setOrt(new Ort("Pfälzer Grill",new Coordinate(49.009835, 8.3944894)));
        State.getInstance().setOrt(new Ort("L'Osteria",new Coordinate(49.0089585, 8.4021160)));
        State.getInstance().setOrt(new Ort("Shotz Blumenstraße",new Coordinate(49.0084830, 8.3961216)));

        launch(args);

    }/


    /**
     * Initialize JavaFX application and main window
     *
     * @param primaryStage
     * @throws Exception
     */
