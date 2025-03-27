package fr.diginamic.maison;

public class WC extends Piece{
    private boolean lavabo;

    public void setLavabo(boolean lavabo) {
        this.lavabo = lavabo;
    }

    public boolean getLavabo(){
        return lavabo;
    }

    public WC(int e, double s, boolean l){
        super(e, s);
        setLavabo(l);
    }

    public WC() {this(0,0,false);}

    @Override
    public String Display(){
        return "Wc: "+  super.Display() + " lavabo : "+ question(this.getLavabo());
    }
}
