package eu.iums.barou.controllers;

import com.sothawo.mapjfx.Coordinate;
import com.sothawo.mapjfx.MapType;
import com.sothawo.mapjfx.MapView;
import com.sothawo.mapjfx.offline.OfflineCache;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainController {

    private static final Coordinate coordKarlsruheHO = new Coordinate(49.01235, 8.38557);

    @FXML
    private Parent mapView;

    @FXML
    private MapController mapController;

    //@FXML
    protected void initialize() {
        // TODO
    }


}
