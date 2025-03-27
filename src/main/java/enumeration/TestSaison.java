package enumeration;

public class TestSaison {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        for (Saison s: saisons){
            System.out.println(s.getLibelle() +" "+  s.getOrder());
        }

        System.out.println(Saison.valueOf("ETE"));
        System.out.println(Saison.SaisonOf("Hiver"));
    }
}
