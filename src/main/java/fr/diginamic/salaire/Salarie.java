package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    private double _salaire;

    public double get_salaire() {
        return _salaire;
    }

    public void set_salaire(double _salaire) {
        this._salaire = _salaire;
    }

    public Salarie(String n, String p, double s){
        super(n, p);
        set_salaire(s);
    }

    @Override
    public double getSalaire(){
        return this.get_salaire();
    }

}
