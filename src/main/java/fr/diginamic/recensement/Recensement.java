package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<Ville> _villeList;

    public void set_villeList(List<Ville> _villeList) {
        this._villeList = _villeList;
    }

    public List<Ville> get_villeList() {
        return _villeList;
    }

    public void AddCities(Ville v){
        this._villeList.add(v);
    }

    public Recensement(){
        set_villeList(new ArrayList<Ville>());
    }

}
