package fichier;

public class Ville {
    private String _nom;
    private String _code;
    private String _region;
    private String _pop;

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_code(String _code) {
        this._code = _code;
    }

    public void set_pop(String _pop) {
        this._pop = _pop;
    }

    public void set_region(String _region) {
        this._region = _region;
    }

    public String get_nom() {
        return _nom;
    }

    public String get_pop() {
        return _pop;
    }

    public String get_code() {
        return _code;
    }

    public String get_region() {
        return _region;
    }

    public Ville(String n, String c, String r, String p){
        set_nom(n);
        set_code(c);
        set_region(r);
        set_pop(p);
    }

    public String Display(){
        return "Nom: "+ this.get_nom()+", Code postal: "+ this.get_code() + ", Region: "+this.get_region() + ", Population " + this.get_pop();
    }

    public String FormatedDisplay(){
        return this.get_nom()+ " | " + this.get_code() + " | "+ this.get_region()+ " | "+ this.get_pop();
    }
}
