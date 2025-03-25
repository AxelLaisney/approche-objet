package listes;

public class Ville {
    private String _nom;
    private int _population;

    public int get_population() {
        return _population;
    }

    public String get_nom() {
        return _nom;
    }

    public void set_population(int _population) {
        this._population = _population;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public Ville(String n, int p){
        set_nom(n);
        set_population(p);
    }

   public String Display(){
        return get_nom()+", "+get_population()+" hab";
    }
}
