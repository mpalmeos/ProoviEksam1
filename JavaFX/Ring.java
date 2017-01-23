package JavaFX;

/**
 * Created by Maie on 22/01/2017.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ring extends Application {

    public int xTelg;
    public int yTelg;
    public int ringiRaadius;

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox kast = new VBox();
        Scene kysimus = new Scene(kast, 500, 500);
        TextField koordinaatX = new TextField();
        koordinaatX.setPromptText("Kirjuta X-koordinaat");
        TextField koordinaatY = new TextField();
        koordinaatY.setPromptText("Kirjuta Y-koordinaat");
        TextField raadius = new TextField();
        raadius.setPromptText("Kirjuta raadius");

        Pane pane = new Pane();
        Scene vastus = new Scene(pane, 500, 500);

        Button edasi = new Button("Edasi");

        String x = koordinaatX.getText();
        String y = koordinaatY.getText();
        String r = raadius.getText();

        xTelg = 123;
        yTelg =254;
        ringiRaadius = 56;

        kast.setAlignment(Pos.CENTER);
        kast.getChildren().addAll(koordinaatX, koordinaatY, raadius, edasi);

        primaryStage.setTitle("Ringi joonistamine");
        primaryStage.setScene(kysimus);
        primaryStage.show();

        edasi.setOnAction(event -> {
            Circle ring = new Circle();
            ring.setCenterX(xTelg);
            ring.setCenterY(yTelg);
            ring.setRadius(ringiRaadius);

            pane.getChildren().addAll(ring);
            primaryStage.setScene(vastus);
            primaryStage.show();
        });
    }
}
