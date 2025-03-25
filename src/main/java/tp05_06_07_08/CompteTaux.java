package tp05_06_07_08;

public class CompteTaux extends Compte{
    private int _taux;

    public int get_taux() {
        return _taux;
    }

    public void set_taux(int _taux) {
        this._taux = _taux;
    }

    public CompteTaux(String numCompte, Double solde, int taux){
        set_numCompte(numCompte);
        set_solde(solde);
        set_taux(taux);
    }

    public CompteTaux() { this("0000-0000-0000", 0.00, 0);}

    @Override
    public String toString(){
        return super.toString() + " avec un taux de " + get_taux() + "%";
    }
}
