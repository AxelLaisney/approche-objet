package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes,
                new Ville("nice", 343000),
                new Ville("carcassone", 47800),
                new Ville("narbonne", 53400),
                new Ville("lyon", 484000),
                new Ville("foix", 9700),
                new Ville("pau", 77200),
                new Ville("marseille", 850700),
                new Ville("tarbes", 40600)
                );

        System.out.println("initial array");
        DisplayList(villes);

        int max = 0;
        int index = 0;
        for(int i = 0; i < villes.size(); i++){
            if(villes.get(i).get_population() > max){
                max = villes.get(i).get_population();
                index = i;
            }
        }

        System.out.println("Ville avec le plus d'hab "+ villes.get(index).Display());

        int min = max;
        index = 0;
        for(int i = 0; i < villes.size(); i++){
            if(villes.get(i).get_population() < min){
                min = villes.get(i).get_population();
                index = i;
            }
        }

        villes.remove(index);

        //Lettre en majuscule des villes avec +100 000 hab
        for(int i = 0; i < villes.size(); i++){
            if(villes.get(i).get_population() > 100000){
                String villeC = villes.get(i).get_nom().substring(0, 1).toUpperCase() + villes.get(i).get_nom().substring(1);
                villes.get(i).set_nom(villeC);
            }
        }

        DisplayList(villes);

    }

    static public void DisplayList(ArrayList<Ville> array){
        for(Ville a: array){
            System.out.println(a.Display());
        }
    }
}
