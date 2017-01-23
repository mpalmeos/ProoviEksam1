package Algoritmid;

/**
 * Created by Maie on 22/01/2017.
 */

import javafx.application.Application;

import java.util.ArrayList;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {

    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; //vastus: 3
        String sona;
        int pikkus;
        int summa = 0;
        double keskmine;
        ArrayList<Integer> arvud = new ArrayList();
        ArrayList<Integer> yleKeskmise = new ArrayList();

         for (int i = 0; i < naide.length; i++) {
             sona = naide[i];
             pikkus = sona.length();
             arvud.add(pikkus);
         }

        for (int i : arvud){
             summa += i;
        }

        keskmine = summa/arvud.size();

        for (int i = 0; i < naide.length; i++) {
            sona = naide[i];
            pikkus = sona.length();
            if (pikkus > keskmine){
                yleKeskmise.add(pikkus);
            }
        }
        System.out.println(yleKeskmise.size());
    }
}

