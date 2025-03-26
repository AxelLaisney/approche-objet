package maps;

public class Pays {
    private String nom;
    private int hab;
    private String continent;

    public int getHab() {
        return hab;
    }

    public String getContinent() {
        return continent;
    }

    public String getNom() {
        return nom;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pays(String n, int h, String c){
        setNom(n);
        setHab(h);
        setContinent(c);
    }
}
