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

        State.getInstance().setStartpunkt(new Coordinate(48.993165,8.400514));

        State.getInstance().setOrt(new Ort("Schloss",new Coordinate(49.013513, 8.404435)));

        /*
        State.getInstance().setOrt("Ludwigs",new Coordinate(latitude: 15774, longitude: 4475));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Schlossgarten",new Coordinate(latitude: 23234 , longitude: 5151));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Venice Beach",new Coordinate(latitude: 16683, longitude: 6334));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Hof Apotheke",new Coordinate(latitude: 16647, longitude: 3579));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Dr. med. Raulin",new Coordinate(latitude: 16718, longitude: 1185));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("ZARA",new Coordinate(latitude: 14275, longitude: 1129));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("REWE",new Coordinate(latitude: 16904, longitude: 8538));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Back Factory",new Coordinate(latitude: 16999, longitude: 6900));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Pfälzer Grill",new Coordinate(latitude: 16666, longitude: 5885));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Losteria",new Coordinate(latitude: 15795, longitude: 1760));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));

        State.getInstance().setOrt("Shots",new Coordinate(latitude: 17332, longitude: 7779));
        State.getInstance().setStartpunkt(new Coordinate(latitude: 48.993165, longitude:8.400514));
*/

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
