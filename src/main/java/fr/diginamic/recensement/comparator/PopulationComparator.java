package fr.diginamic.recensement.comparator;

import fr.diginamic.recensement.Ville;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Ville> {
    public int compare (Ville v1, Ville v2){
        return Integer.compare((int) v1.get_pop(), (int) v2.get_pop());
    }
}
