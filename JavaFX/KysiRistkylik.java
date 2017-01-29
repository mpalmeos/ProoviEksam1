package JavaFX;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * Created by Maie on 28/01/2017.
 */
public class KysiRistkylik {

    Pane paneSisse;
    int[] c = new int[4];

    public KysiRistkylik(Pane pane){
        pane = paneSisse;
        kysiAsju();
        joonistaAsi();
    }

    public void kysiAsju(){

        TextField text = new TextField("Kirjuta koordinaadid ja suurus (sidekriipsuga)");
        String a = text.getText();
        String[] b = a.split("-");

        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);
        }
    }

    public void joonistaAsi(){
        Rectangle ruut = new Rectangle(c[0], c[1], c[2], c[3]);
        paneSisse.getChildren().addAll(ruut);
    }
}
