package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();

        for(int i = 1; i < 101; i++){
            number.add(i);
        }

        System.out.println(number.size());

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();

        for(String l: liste1){
            liste3.add(l);
        }

        for(String l: liste2){
            liste3.add(l);
        }

        //suggéré par l'IDE
        // liste3.addAll(liste1);

        for(String l: liste3){
            System.out.println(l);
        }
    }
}
