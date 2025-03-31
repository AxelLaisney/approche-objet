package sets;

public class Pays {
    private String _nom;
    private int _hab;
    private double _PIB;

    public String get_nom() {
        return _nom;
    }

    public double get_PIB() {
        return _PIB;
    }

    public int get_hab() {
        return _hab;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_hab(int _hab) {
        this._hab = _hab;
    }

    public void set_PIB(double _PIB) {
        this._PIB = _PIB;
    }

    public Pays(String n, int h, double p){
        set_hab(h);
        set_nom(n);
        set_PIB(p);
    }
}
