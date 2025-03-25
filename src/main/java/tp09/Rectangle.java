package tp09;

public class Rectangle implements ObjetGeometrique{

    private double longueur;
    private double largeur;

    public Rectangle(double lo, double la){
        setLargeur(la);
        setLongueur(lo);
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    @Override
    public double perimetre() {
        return (getLongueur() + getLargeur()) * 2;
    }

    @Override
    public double surface() {
        return getLargeur() * getLongueur();
    }
}
