package tp05_06_07_08;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte();
        System.out.println(compte1.toString());
        compte1.set_numCompte("1234-5678-9101");
        compte1.set_solde(100.50);
        System.out.println(compte1.toString());

        Compte compteN = new Compte();
        CompteTaux compteT = new CompteTaux();

        Compte[] comptes = new Compte[2];
        comptes[0] = compteN;
        comptes[1] = compteT;

        for(Object c: comptes){
           System.out.println(c.toString());
        }


    }
}
