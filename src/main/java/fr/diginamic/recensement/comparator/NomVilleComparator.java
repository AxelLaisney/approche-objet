package fr.diginamic.recensement.comparator;

import fr.diginamic.recensement.Ville;

import java.util.Comparator;

public class NomVilleComparator implements Comparator<Ville> {
    public int compare(Ville v1, Ville v2){
        return v1.get_nomComu().compareToIgnoreCase(v2.get_nomComu());
    }
}
