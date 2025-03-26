package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        System.out.println("Affichage du n° de département");
        for(Integer code: mapVilles.keySet()){
            System.out.println(code);
        }

        System.out.println("Affichage du nom de la ville");
        for(String n: mapVilles.values()){
            System.out.println(n);
        }

        System.out.println("Taille de la mapville: "+mapVilles.size());
    }
}
