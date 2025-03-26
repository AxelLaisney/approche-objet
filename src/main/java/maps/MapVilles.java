package maps;

import listes.Ville;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MapVilles {
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

        HashMap<String, Ville> mapVille = new HashMap<>();

        for(Ville v: villes){
            mapVille.put(v.get_nom(), v);
        }

        System.out.println("/// mapVille originaly ///");
        for (Ville v: mapVille.values()){
            System.out.println(v.get_nom()+", "+v.get_population()+" hab");
        }


        int min = 0;
        String key = "";

        for(String k: mapVille.keySet()){
            if(min == 0){
                min = mapVille.get(k).get_population();
            }

            if(mapVille.get(k).get_population() < min){
                min = mapVille.get(k).get_population();
                key = k;
            }
        }

        mapVille.remove(key);
        System.out.println("/// mapVille after removed ville with the smallest pop ///");
        for (Ville v: mapVille.values()){
            System.out.println(v.get_nom()+", "+v.get_population()+" hab");
        }
    }
}
