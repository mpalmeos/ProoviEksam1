package OOP;

/**
 * Created by Maie on 29/01/2017.
 */
public class Pastakas {

    int tint;
    int kulutatudTint;
    int tintAlles;

    public Pastakas(int tindiKogus){
        tint = tindiKogus;
        System.out.println(tint);
    }

    public void kirjuta(String text){

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isSpaceChar(c)){
                count++;
            }
        }

        kulutatudTint = count;
        System.out.println(kulutatudTint);
        System.out.println(text);
    }

    public void prindiPaljuTintiAlles(){
        tintAlles = tint - kulutatudTint;
        System.out.println("Tinti on alles: " + tintAlles);
    }
}
