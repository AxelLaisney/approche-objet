package fr.diginamic.recensement;

public class Ville {
    private String _codeRegion;
    private String _nomRegion;
    private String _codeDepart;
    private String _codeComu;
    private String _nomComu;
    private long _pop;

    public String get_nomComu() {
        return _nomComu;
    }

    public String get_nomRegion() {
        return _nomRegion;
    }

    public long get_pop() {
        return _pop;
    }

    public String get_codeComu() {
        return _codeComu;
    }

    public String get_codeDepart() {
        return _codeDepart;
    }

    public String get_codeRegion() {
        return _codeRegion;
    }

    public void set_nomComu(String _nomComu) {
        this._nomComu = _nomComu;
    }

    public void set_codeRegion(String _codeRegion) {
        this._codeRegion = _codeRegion;
    }

    public void set_codeDepart(String _codeDepart) {
        this._codeDepart = _codeDepart;
    }

    public void set_codeComu(String _codeComu) {
        this._codeComu = _codeComu;
    }

    public void set_nomRegion(String _nomRegion) {
        this._nomRegion = _nomRegion;
    }

    public void set_pop(long _pop) {
        this._pop = _pop;
    }

    public Ville (String nomRegion, String nomCommune, String codeRegion, String codeDepartement, String codeCommune, String population){
        set_codeComu(codeCommune);
        set_codeDepart(codeDepartement);
        set_pop(Long.parseLong(population.trim().replaceAll(" ", "")));
        set_codeRegion(codeRegion);
        set_nomRegion(nomRegion);
        set_nomComu(nomCommune);
    }

    public Ville(){
        this("", "", "0", "0", "0", "0");
    }
}
