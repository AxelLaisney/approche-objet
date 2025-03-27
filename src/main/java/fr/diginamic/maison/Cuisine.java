package fr.diginamic.maison;

public class Cuisine extends Piece{
    private boolean haute;

    public void setHaute(boolean haute) {
        this.haute = haute;
    }

    public boolean getHaute(){
        return haute;
    }

    public Cuisine(int e, double s, boolean h){
        super(e, s);
        setHaute(h);
    }

    public Cuisine() {this(0,0,false);}

    @Override
    public String Display(){

        return "Cuisine: "+ super.Display() + " Haute: "+ question(this.getHaute());
    }
}
