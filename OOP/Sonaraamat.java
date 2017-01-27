package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maie on 27/01/2017.
 */
public class Sonaraamat {

   ArrayList<String> sonad = new ArrayList<String>();

    private String keel;

    public Sonaraamat(String raamatuKeel) {
        keel = raamatuKeel;
    }

    public void sisestaSona(String s){
        sonad.add(s);
    }

    public String[] otsiEsimeseTaheJargi(String taht){
        char esimeneTaht = taht.charAt(0);
        ArrayList<String> sobivaAlgusega = new ArrayList<String>();
        for (int i = 0; i < sonad.size(); i++) {
            if (sonad.get(i).charAt(0) == esimeneTaht){
                String tahegaSona = sonad.get(i);
                sobivaAlgusega.add(tahegaSona);
            }
        }
        String[] sobibSona = new String[sobivaAlgusega.size()];
        for (int i = 0; i < sobivaAlgusega.size(); i++) {
            sobibSona[i] = sobivaAlgusega.get(i);
        }
        return sobibSona;
    }

    public void eemaldaSona(String e){
        sonad.remove(e);
    }

    public void misKeelesRaamatOn(){
        System.out.println(keel);
    }

}
