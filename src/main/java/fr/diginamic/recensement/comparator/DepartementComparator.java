package fr.diginamic.recensement.comparator;

import fr.diginamic.recensement.Ville;

import java.util.Comparator;

public class DepartementComparator implements Comparator<Ville> {
    public int compare(Ville v1, Ville v2){
        return v1.get_codeDepart().compareToIgnoreCase(v2.get_codeDepart());
    }
}
