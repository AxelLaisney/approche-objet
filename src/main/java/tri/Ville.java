package tri;

public class Ville implements Comparable<Ville> {
    private String _nom;
    private int _population;

    public int get_population() {
        return _population;
    }

    public String get_nom() {
        return _nom;
    }

    public void set_population(int _population) {
        this._population = _population;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public String Display(){
        return get_nom()+", "+get_population()+" hab";
    }

    public Ville(String n, int p){
        set_nom(n);
        set_population(p);
    }

    //tri sur le nom
//    @Override
//    public int compareTo(Ville v){
//        if(!this.get_nom().equalsIgnoreCase(v.get_nom())){
//            return this.get_nom().compareTo(v.get_nom());
//        }
//        return this.get_population() - v.get_population();
//    }

    //tri sur le nb d'hab
    @Override
    public int compareTo(Ville v){
        if(this.get_population() > v.get_population()){
            return 1;
        }else if(this.get_population() < v.get_population()){
            return -1;
        }else{
            return 0;
        }
    }
}
