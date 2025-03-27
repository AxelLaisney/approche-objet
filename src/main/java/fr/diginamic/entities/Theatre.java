package fr.diginamic.entities;

public class Theatre {
    private String _nom;
    private int _capacity;
    private int  _inscrit;
    private double _recette;

    public String get_nom() {
        return _nom;
    }

    public double get_recette() {
        return _recette;
    }

    public int get_capacity() {
        return _capacity;
    }

    public int get_inscrit() {
        return _inscrit;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }

    public void set_inscrit(int _inscrit) {
        this._inscrit = _inscrit;
    }

    public void set_recette(double _recette) {
        this._recette = _recette;
    }

    public Theatre(String n, int c){
        set_nom(n);
        set_capacity(c);
        set_inscrit(0);
        set_recette(0.00);
    }

    public String Inscrire(int client, double prix){
        if((this.get_inscrit() + client) > this.get_capacity()){
            return "Theater is already full!";
        }else{
            this.set_inscrit(this.get_inscrit() + client);
            this.set_recette(this.get_recette() + prix);
            return "Client added";
        }
    }

    public String Display(){
        return this.get_nom() + " has a total of "+this.get_inscrit()+" clients and made a total of "+this.get_recette()+" €";
    }
}
