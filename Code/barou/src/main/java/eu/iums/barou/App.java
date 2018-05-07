package eu.iums.barou;

import com.sun.xml.internal.bind.v2.model.core.ID;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;

import java.awt.event.ActionListener;

import static javafx.scene.input.KeyCode.R;

/**
 * The main entry point of the application. Initializes the JavaFX UI as well as other required resources and services.
 *
 * The application logic should be delegated to the controllers and other components.
 */
public class App extends javafx.application.Application {

    public static void main(String[] args) {
        launch(args);
    }
    Button button = new Button()

    /**
     * Initialize JavaFX application and main window
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MainView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
