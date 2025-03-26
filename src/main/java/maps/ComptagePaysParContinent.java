package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> Pays = new ArrayList<>();

        Collections.addAll(Pays,
                new Pays("France", 65000000, "Europe"),
                new Pays("Allemagne", 80000000, "Europe"),
                new Pays("Belgique", 10000000, "Europe"),
                new Pays("Russie", 150000000, "Asie"),
                new Pays("Chine", 1400000000, "Asie"),
                new Pays("Indonésie", 220000000, "Océanie"),
                new Pays("Australie", 20000000, "Océanie")
                );

        HashMap<String, Integer> Comptage = new HashMap<>();
        compt(Pays, Comptage);

        for(String c: Comptage.keySet()){
            System.out.println(c + ", "+Comptage.get(c));
        }
    }

    public static void compt(ArrayList<Pays> pays, HashMap<String, Integer> map){
        String currentContinent = "";
        int count = 0;

        for(Pays p: pays){
            if(!p.getContinent().equals(currentContinent)){
                currentContinent = p.getContinent();
                for (Pays pa: pays){
                    if(pa.getContinent().equals(currentContinent)){
                        count++;
                    }
                }
                map.put(currentContinent, count);
                count = 0;
            }
        }
    }
}
