package tp05;

public class Compte {
    private String _numCompte;
    private Double _solde;

    public String get_numCompte(){
        return _numCompte;
    }

    public Double get_solde(){
        return _solde;
    }

    public void set_numCompte(String _numCompte) {
        this._numCompte = _numCompte;
    }

    public void set_solde(Double _solde) {
        this._solde = _solde;
    }

    public Compte(String num, Double solde){
        set_numCompte(num);
        set_solde(solde);
    }

    public Compte() { this("0000-0000-0000-0000", 0.00);}

    public void Display(){
        System.out.println("Compte N° "+get_numCompte()+" with a balance of : "+get_solde());
    }
}
