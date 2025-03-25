package tp09;

public class Cercle implements ObjetGeometrique{
    private double _rayon;

    public Cercle(double r){
        setRayon(r);
    }

    public void setRayon(double rayon) {
        this._rayon = rayon;
    }

    public double getRayon() {
        return _rayon;
    }

    @Override
    public double perimetre() {
        return 2 * getRayon() * 3.14;
    }

    @Override
    public double surface() {
        return Math.pow(_rayon, 2) * 3.14;
    }
}
