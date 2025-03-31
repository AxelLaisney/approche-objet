package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetObjets {
    public static void main(String[] args) {
        HashSet<Pays> paysSet = new HashSet<>();
        Collections.addAll(paysSet,
                new Pays("USA", 340000000, 27000000000.00),
                new Pays("France", 65000000, 3000000000.00),
                new Pays("Allemagne", 830000000, 4000000000.00),
                new Pays("UK", 68000000, 3000000000.00),
                new Pays("Italie", 58000000, 2000000000.00),
                new Pays("Japon", 124000000, 4000000000.00),
                new Pays("Chine", 14000000, 17000000000.00),
                new Pays("Russie", 143000000, 2000000000.00),
                new Pays("Inde", 1438000000, 3568000000.00)
                );
        Pays pibMax = null;
        double max = 0;
        for(Pays p: paysSet ){
            if(p.get_PIB() > max){
                max = p.get_PIB();
                pibMax = p;
            }
        }
        System.out.println("Pays avec le plus grand PIB" + pibMax.get_nom());

        double min = max;
        Pays payPibMin = null;
        for(Pays p: paysSet){
            if(p.get_PIB() < min){
                min = p.get_PIB();
                payPibMin = p;
            }
        }
        payPibMin.set_nom(payPibMin.get_nom().toUpperCase());
        System.out.println("Pays avec le pib le plus petit: "+ payPibMin.get_nom());
        paysSet.remove(pibMax);
        for (Pays p: paysSet){
            System.out.println(p.get_nom()+" "+p.get_hab()+" "+p.get_PIB());
        }
    }
}
