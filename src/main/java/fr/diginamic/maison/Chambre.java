package fr.diginamic.maison;

public class Chambre extends Piece{
    private int meubles;

    public void setMeubles(int meubles) {
        this.meubles = meubles;
    }

    public int getMeubles() {
        return meubles;
    }

    public Chambre(int e, double s,int m){
        super(e, s);
        setMeubles(m);
    }

    public Chambre () { this(0, 0, 0);}

    @Override
    public String Display(){
        return "Chambre: "+ super.Display() + " meubles: "+this.getMeubles();
    }
}
