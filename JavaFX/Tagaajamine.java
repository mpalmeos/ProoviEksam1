package JavaFX;

/**
 * Created by Maie on 25/01/2017.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle ring = new Circle();
        ring.setCenterX(Math.random()*500);
        ring.setCenterY(Math.random()*500);
        ring.setRadius(50);

        Pane pane = new Pane();
        pane.getChildren().addAll(ring);
        Scene stseen = new Scene(pane, 500, 500);

        primaryStage.setScene(stseen);
        primaryStage.show();

        ring.setOnMouseEntered(event -> {
            ring.setCenterX(Math.random()*500);
            ring.setCenterY(Math.random()*500);
        });
    }
}
