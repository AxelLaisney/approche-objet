package entities;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale("dasda", "dasdfsd", "dasfa", "dasdas");
        AdressePostale adresse2 = new AdressePostale("terter", "ttrwe", "rwerwe", "twrw");
        Personne personne1 = new Personne("ae", "eqw", adresse1);
        Personne personne2 = new Personne("rqrw", "rweqrw", adresse2);
        Personne personne3 = new Personne();
        personne3.Display();
        System.out.println(personne3.adresse.ville);
        personne3.ChangeAdresse(new AdressePostale("t", "t", "t", "t"));
        System.out.println(personne3.adresse.ville);
    }
}
