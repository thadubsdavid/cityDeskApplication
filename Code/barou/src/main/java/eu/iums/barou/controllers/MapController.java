package eu.iums.barou.controllers;

import com.sothawo.mapjfx.Coordinate;
import com.sothawo.mapjfx.MapType;
import com.sothawo.mapjfx.MapView;
import com.sothawo.mapjfx.offline.OfflineCache;
import javafx.fxml.FXML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MapController {

    private static final Coordinate coordKarlsruheHO = new Coordinate(49.01235, 8.38557);

    @FXML
    private MapView mapView;

    @FXML
    protected void initialize() {
        // initialize MapView-Cache
        final OfflineCache offlineCache = mapView.getOfflineCache();
        final String cacheDir = System.getProperty("java.io.tmpdir") + "/mapjfx-cache";
        try {
            Files.createDirectories(Paths.get(cacheDir));
            offlineCache.setCacheDirectory(cacheDir);
          //  offlineCache.setActive(true);
        } catch (IOException e) {
        }
        mapView.setMapType(MapType.OSM);
        mapView.setCenter(coordKarlsruheHO);
        mapView.setZoom(14);
        mapView.initialize();

    }
}
