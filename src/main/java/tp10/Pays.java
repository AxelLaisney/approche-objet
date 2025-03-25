package tp10;

import java.util.Objects;

public class Pays {
    private String _nom;
    private int _population;

    public Pays(String n, int p){
        set_nom(n);
        set_population(p);
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_population(int _population) {
        this._population = _population;
    }

    public int get_population() {
        return _population;
    }

    public String get_nom() {
        return _nom;
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Pays)){
            return false;
        }

        Pays pays = (Pays) object;
        if(Objects.equals(pays.get_nom(), get_nom()) && Objects.equals(pays.get_population(), get_population())){
            return true;
        }else {
            return false;
        }
    }
}
