package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
    private ArrayList<Piece> pieces = new ArrayList<>();



    public String ajouterPiece(Piece piece){
        if(piece == null){
            return "Piece is null";
            }else{
            pieces.add(piece);
            return piece.getClass().getSimpleName() + " has been added";
        }

    }

    public ArrayList<Piece> getPieces(){
        return pieces;
    }

    public double getSuperficieTotale(){
        double superficietotal = 0;
        for(Piece p: getPieces()){
            superficietotal += p.getSuperficie();
        }
        return superficietotal;
    }

    public double getSuperficieParEtage(int etage){
        double superficietotal = 0;
        for (Piece p: getPieces()){
            if(p.getEtage() == etage){
                superficietotal += p.getSuperficie();
            }
        }
        return  superficietotal;
    }

    public double getSuperficieParType(Piece piece){
        double superficietotal = 0;
        for(Piece p: pieces){
            if(p.getClass().getSimpleName().equals(piece.getClass().getSimpleName())){
                superficietotal += p.getSuperficie();
            }
        }
        return superficietotal;
    }

    public int NbPieceParType(Piece piece){
        int nbPiece = 0;
        for(Piece p: pieces){
            if(p.getClass().getSimpleName().equals(piece.getClass().getSimpleName())){
                nbPiece ++;
            }
        }

        return  nbPiece;
    }
}
