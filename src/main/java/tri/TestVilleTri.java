package tri;
import java.util.ArrayList;
import java.util.Collections;

public class TestVilleTri {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes,
                new Ville("nice", 343000),
                new Ville("carcassone", 47800),
                new Ville("narbonne", 53400),
                new Ville("lyon", 484000),
                new Ville("foix", 9700),
                new Ville("pau", 77200),
                new Ville("marseille", 850700),
                new Ville("tarbes", 40600)
        );

        System.out.println("/// Avant tri ///");
        DisplayVille(villes);
//        Collections.sort(villes, Collections.reverseOrder());
        //utilisation des comparator

        Collections.sort(villes, new ComparatorNom());
        System.out.println("/// Premier tri sur le nom ///");
        DisplayVille(villes);
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println("///Second tri sur le nb hab ///");
        DisplayVille(villes);
    }

    public static void DisplayVille(ArrayList<tri.Ville> array){
        for(Ville a: array){
            System.out.println(a.Display());
        }
    }
}
