package fr.diginamic.chaines;

public class Salarie {
    private String _nom;
    private String _prenom;
    private double _salaire;

    public String get_nom() {
        return _nom;
    }

    public double get_salaire() {
        return _salaire;
    }

    public String get_prenom() {
        return _prenom;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_prenom(String _prenom) {
        this._prenom = _prenom;
    }

    public void set_salaire(double _salaire) {
        this._salaire = _salaire;
    }

    public Salarie (String n, String p, double s){
        this.set_nom(n);
        this.set_prenom(p);
        this.set_salaire(s);
    }
}
