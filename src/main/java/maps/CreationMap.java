package maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Integer> salarie = new HashMap<>();
        salarie.put("Paul", 1750);
        salarie.put("Hicham", 1825);
        salarie.put("Yu", 2250);
        salarie.put("Ingrid", 2015);
        salarie.put("Chantal", 2418);

        System.out.println(salarie.size());

    }
}
