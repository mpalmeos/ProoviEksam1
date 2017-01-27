package JavaFX;

/**
 * Created by Maie on 25/01/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

        VBox kyssa = new VBox();

        TextField KustX = new TextField("Alguse X");
        TextField KustY = new TextField("Alguse Y");
        TextField KuhuX = new TextField("Lõpu X");
        TextField KuhuY = new TextField("Lõpu Y");

        Button nupp = new Button("Sisesta");

        kyssa.getChildren().addAll(KustX, KustY, KuhuX, KuhuY, nupp);

        Scene aken = new Scene(kyssa, 500, 500);

        primaryStage.setScene(aken);
        primaryStage.show();

        nupp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                int kustX = Integer.parseInt(KustX.getText());
                int kustY = Integer.parseInt(KustY.getText());
                int kuhuX = Integer.parseInt(KuhuX.getText());
                int kuhuY = Integer.parseInt(KuhuY.getText());

                Line joon = new Line(kustX, kustY, kuhuX, kuhuY);
                Pane park = new Pane();
                park.getChildren().addAll(joon);

                Scene aken2 = new Scene(park, 500, 500);

                primaryStage.setScene(aken2);
                primaryStage.show();
            }
        });
    }
}
