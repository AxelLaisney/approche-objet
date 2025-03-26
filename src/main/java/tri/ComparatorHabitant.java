package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    public int compare(Ville v1, Ville v2){
        return Integer.compare(v1.get_population(), v2.get_population());
    }
}
