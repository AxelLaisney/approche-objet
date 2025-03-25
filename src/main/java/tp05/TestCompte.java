package tp05;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte();
        compte1.Display();
        compte1.set_numCompte("1234-5678-9101");
        compte1.set_solde(100.50);
        compte1.Display();
    }
}
