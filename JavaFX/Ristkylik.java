package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Maie on 28/01/2017.
 */
public class Ristkylik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500);

        KysiRistkylik m = new KysiRistkylik(pane);

        primaryStage.setScene(stseen);
        primaryStage.show();
    }
}
