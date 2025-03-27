package fr.diginamic.salaire;

public abstract class Intervenant {
    protected String _nom;
    protected String _prenom;

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_prenom(String _prenom) {
        this._prenom = _prenom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public String get_nom() {
        return _nom;
    }

    public Intervenant(String n, String p){
        set_nom(n);
        set_prenom(p);
    }

    public abstract double getSalaire();
    public String AfficherDonnes(){
        String className = this.getClass().getSimpleName();
        String status = "";
        if(className.equals("Salarie")){
            status = "CDI";
        }
        if(className.equals("Pigiste")){
            status = "Pigiste";
        }

        return "Nom :"+this.get_nom()+" Prenom: "+this.get_prenom()+" Status: "+status+ " Salaire: "+getSalaire();
    }
}
