package enumeration;

import java.util.Objects;

public enum Saison {

    PRINTMEPS("Printemps", 1),
    ETE("Été", 1),
    AUTOMNE("Automne", 2),
    HIVER("Hiver", 4);

    private String libelle;
    private int order;

    private Saison(String l, int o){
        this.libelle = l;
        this.order = o;
    }

    public int getOrder() {
        return order;
    }

    public String getLibelle() {
        return libelle;
    }

    public static Saison SaisonOf(String s){
        for(Saison sa: Saison.values()){
            if(sa.getLibelle().equals(s)){
                return sa;
            }
        }
        return null;
    }
}
