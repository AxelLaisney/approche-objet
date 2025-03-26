package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    public int compare(Ville v1, Ville v2){
        return v1.get_nom().compareTo(v2.get_nom());
    }
}
