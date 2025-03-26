package maps;

import java.util.HashMap;

public class FusionMaps {
    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
// Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<>();

        addToMap3(map1, map3);
        addToMap3(map2, map3);

        for(Integer k: map3.keySet()){
            System.out.println("Key is: "+ k +" | Value is: "+map3.get(k));
        }
    }

    public static void addToMap3(HashMap<Integer, String> maptoAdd, HashMap<Integer, String> mapToReceive){
        for(Integer m: maptoAdd.keySet()){
            mapToReceive.put(m, maptoAdd.get(m));
        }
    }
}
