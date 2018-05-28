package eu.iums.barou;

import com.sothawo.mapjfx.Coordinate;
import eu.iums.barou.controllers.Language;
import eu.iums.barou.model.Ort;
import eu.iums.barou.model.State;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sun.tools.jar.Main;

import javax.swing.*;
import java.io.IOException;

/**
 * The main entry point of the application. Initializes the JavaFX UI as well as other required resources and services.
 *
 * The application logic should be delegated to the controllers and other components.
 */
public class App extends javafx.application.Application {


    public static void main(String[] args) {

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

    }


    /**
     * Initialize JavaFX application and main window
     *
     * @param primaryStage
     * @throws Exception
     */

    Stage window;
    Scene ButtonBar, Search;



    @FXML
    public Button button_Sprache;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Scene Language = FXMLLoader.load(App.class.getResource("Language.fxml"));
        //window = primaryStage;
        //button_Sprache.setOnAction(e -> window.setScene(Language));

        FXMLLoader loader = new FXMLLoader();
        String pfad = "ButtonBar.fxml";
        loader.setLocation(getClass().getResource(pfad));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        }


    /*static Stage stg;

    public void start (Stage stage) throws Exception {
        this.stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("Search.fxml"));
        stage.show();
    }*/
}
