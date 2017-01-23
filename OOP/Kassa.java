package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Maie on 23/01/2017.
 */
public class Kassa {

    String kassa;
    List<String> kaup = new ArrayList();

    public Kassa(String kassiir) {
        this.kassa = kassiir;
    }

    public void lisaToode(String toode){
        kaup.add(toode);
    }

    public void eemaldaToode(String toodeMiinus){
        kaup.remove(toodeMiinus);
    }

    public void prindiOstutsekk(){
        System.out.println(kaup);
    }

    public void prindiKassapidajaNimi(){
        System.out.println(kassa);
    }
}
