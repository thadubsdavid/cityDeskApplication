package eu.iums.barou;

import com.sothawo.mapjfx.Coordinate;
import eu.iums.barou.controllers.Language;
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
