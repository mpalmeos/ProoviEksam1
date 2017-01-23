package Maatriks;

/**
 * Created by Maie on 23/01/2017.
 */

import java.util.Arrays;

/**
 * Nüüd paneme loode ja kagu nurga kokku ja loome pealtvaates püramiidi:
 *
 *  0 0 0 0 0 0 0 0 0
 *  0 1 1 1 1 1 1 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 3 4 3 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 1 1 1 1 1 1 0
 *  0 0 0 0 0 0 0 0 0
 *
 *  Kui tuletad meelde kuidas loode ja kagu nurka lahendada ning
 *  kuidas kirdest edelasse diagonaali joonistada, siis tead ka
 *  kuidas seda ülesannet lahendada.
 *
 *  Massiivi ei ole vaja panna, lihtsalt prindi välja. Ära üle
 *  mõtle - lahendada on võimalik kahe tsükli ja ühe if lausega.
 */
public class Pyramiid {

    public static void main(String[] args) {
        int[][] maatrix = new int[9][9];

        for (int i = 0; i < maatrix.length; i++) {
            for (int j = 0; j < maatrix[i].length; j++) {
                if (i+j==i || i+j==j || i+j==i+8 || j+i==j+8){
                    maatrix[i][j] = 0;
                } else if (i+j==i+1 || i+j==j+1 || i+j==i+7 || j+i==j+7){
                    maatrix[i][j]= 1;
                } else if (i+j==i+2 || i+j==j+2 || i+j==i+6 || j+i==j+6){
                    maatrix[i][j]=2;
                } else if (i+j==i+3 || i+j==j+3 || i+j==i+5 || j+i==j+5){
                    maatrix[i][j]=3;
                }else {
                    maatrix[i][j]=4;
                }
            }

            System.out.println(Arrays.toString(maatrix[i]));
        }
    }
}
