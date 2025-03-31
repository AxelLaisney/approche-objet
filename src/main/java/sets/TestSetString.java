package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> pays = new HashSet<>();

        Collections.addAll(pays, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Russie", "Inde");

        int max = 0;
        String s = "";
        for(String p: pays){
            if (p.length() > max){
                max = p.length();
                s = p;
            }
        }

        System.out.println("Mot le plus long: "+s);
        pays.remove(s);
        System.out.println("Removed");
        for(String p: pays){
            System.out.println(p);
        }
    }
}
