package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>();

        Collections.addAll(villes, "nice", "carcassone", "lyon", "foix", "pau", "marseille", "tarbes");
        int maxLetters = 0;
        String ville = "";
        for(String v: villes){
            if(v.length() > maxLetters){
                maxLetters = v.length();
                ville = v;
            }
        }
        System.out.println("La ville avec le plus de lettre: " + ville);

        for(int i = 0; i < villes.size(); i++){
            //le premier substring commence à l'index 0 et termine à l'index 1(non inclu)
            //le second substring commence à l'index 1
            String villeC = villes.get(i).substring(0, 1).toUpperCase() + villes.get(i).substring(1);
            villes.set(i, villeC);
        }

        Display(villes);

        ArrayList<Integer> indexToRemove = new ArrayList<>();
        for(int i = 0; i < villes.size(); i++){
            if(villes.get(i).charAt(0) == 'n' || villes.get(i).charAt(0) == 'N'){
                indexToRemove.add(i);
            }
        }

        for(int i: indexToRemove){
            villes.remove(i);
        }

        System.out.println("Ville commeçant par N removed");
        Display(villes);
    }
    public static void Display(ArrayList<String> array){
        for(String a: array){
            System.out.println(a);
        }
    }
}
