package fr.diginamic.salaire;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie1 = new Salarie("A", "Bob", 2000);
        Pigiste pigiste1 = new Pigiste("C", "Dunban", 15, 300);

        System.out.println(salarie1.get_nom()+ " "+ salarie1.get_prenom()+ " "+salarie1.getSalaire());
        System.out.println(pigiste1.get_nom()+ " "+ pigiste1.get_prenom()+ " "+pigiste1.getSalaire());

        System.out.println(salarie1.AfficherDonnes());
        System.out.println(pigiste1.AfficherDonnes());
    }
}
