package fr.diginamic.maison;

public abstract class Piece {
    protected int etage;
    protected double superficie;

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        if(etage < 0){
            etage = 0;
        }
        this.etage = etage;
    }

    public void setSuperficie(double superficie) {
        if(superficie < 0){
            superficie = superficie * -1;
        }
        this.superficie = superficie;
    }

    protected Piece(int e, double s){
        setEtage(e);
        setSuperficie(s);
    }

    protected String Display(){
        return "Étage: "+this.getEtage()+" Superficie: "+ this.getSuperficie();
    }

    protected String question(Boolean b){
        String q = "non";
        if(b){
            q = "oui";
        }
        return q;
    }


}
