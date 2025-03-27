package fr.diginamic.maison;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison1 = new Maison();
        Chambre chambre1 = new Chambre(1 , 30, 5);
        Chambre chambre2 = new Chambre(1, 25, 8);
        Chambre chambre3 = new Chambre(1, 25, 3);

        SalleDeBain salleDeBain1 = new SalleDeBain(1, 15, false, true);

        WC wc1 = new WC(0, 5, true);

        Cuisine cuisine1 = new Cuisine(0, 20, true);

        Salon salon1 = new Salon(0, 35, 10, true);

        maison1.ajouterPiece(chambre1);
        maison1.ajouterPiece(chambre2);
        maison1.ajouterPiece(chambre3);
        maison1.ajouterPiece(wc1);
        maison1.ajouterPiece(cuisine1);
        maison1.ajouterPiece(salleDeBain1);
        maison1.ajouterPiece(salon1);

        //tests
        System.out.println(maison1.ajouterPiece(null));
        maison1.ajouterPiece(new SalleDeBain(-1, -2.00, false, false));

        System.out.println("Pieces de la maison:");
        for(Piece p: maison1.getPieces()){
            System.out.println(p.Display());
        }

        System.out.println("expected result 155 | result: "+ maison1.getSuperficieTotale());

        System.out.println("expected result 3 | result: "+maison1.NbPieceParType(new Chambre()));
        System.out.println("expected result 1 | result: "+maison1.NbPieceParType(new Salon()));

        System.out.println("expected result 5 | result: "+maison1.getSuperficieParType(new WC()));
        System.out.println("expected result 80 | result: "+maison1.getSuperficieParType(new Chambre()));

        System.out.println("expected result 60 | result: "+maison1.getSuperficieParEtage(0));
        System.out.println("expected result 95 | result: "+maison1.getSuperficieParEtage(1));



    }
}
