package JavaFX;

/**
 * Created by Maie on 25/01/2017.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        int kustX;
        int kustY;
        int kuhuX;
        int kuhuY;

        Line joon = new Line();
        joon.setStartX(kustX);
        joon.setStartY(kustY);
        joon.setEndX(kuhuX);
        joon.setEndY(kuhuY);

        VBox kyssa = new VBox();

        TextField KustX = new TextField("Alguse X");
        TextField KustY = new TextField("Alguse Y");
        TextField KuhuX = new TextField("Lõpu X");
        TextField KuhuY = new TextField("Lõpu Y");

        kyssa.getChildren().addAll();

        Pane park = new Pane();
        park.getChildren().addAll(joon);
        Scene aken = new Scene(kyssa, 500, 500);
        Scene aken2 = new Scene(park, 500, 500);

        Button nupp = new Button("Sisesta");
        nupp.setOnAction(event -> {
            primaryStage.setScene(aken2);
            primaryStage.show();
        });

        primaryStage.setScene(aken);
        primaryStage.show();

    }
}
