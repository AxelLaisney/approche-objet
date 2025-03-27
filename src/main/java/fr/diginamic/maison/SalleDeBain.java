package fr.diginamic.maison;

public class SalleDeBain extends Piece{
    private boolean wc;
    private boolean baignoire;

    public void setBaignoire(boolean baignoire) {
        this.baignoire = baignoire;
    }

    public void setWc(boolean wc) {
        this.wc = wc;
    }

    public boolean getWc(){
        return wc;
    }

    public boolean getBaignoire(){
        return baignoire;
    }

    public SalleDeBain(int e, double s, boolean w, boolean b){
        super(e, s);
        setWc(w);
        setBaignoire(b);
    }

    public SalleDeBain () {this(0,0,false,false);}

    @Override
    public String Display(){
        return "Salle de bain: "+ super.Display() + " wc: " + question(this.getWc()) + " baignoire : "+ question(this.getBaignoire());
    }


}
