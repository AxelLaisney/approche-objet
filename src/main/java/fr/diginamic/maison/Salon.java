package fr.diginamic.maison;


public class Salon extends Piece{
    private int meubles;
    private boolean clim;

    public void setMeubles(int meubles) {
        this.meubles = meubles;
    }

    public void setClim(boolean clim) {
        this.clim = clim;
    }

    public int getMeubles() {
        return meubles;
    }

    public boolean getClim(){
        return clim;
    }

    public Salon(int e, double s, int m, boolean c){
        super(e, s);
        setClim(c);
        setMeubles(m);
    }

    public Salon() {this(0,0,0,false);}

    @Override
    public String Display(){
        return "Salon: "+ super.Display() + " meubles: "+this.getMeubles() + " clim: "+question(this.getClim());
    }
}
