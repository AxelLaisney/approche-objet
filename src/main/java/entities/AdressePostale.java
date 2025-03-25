package entities;

public class AdressePostale {
    String numeroRue;
    String libelleRue;
    String codePostal;
    String ville;

    public AdressePostale(String numbRue, String libRue, String code, String ville){
        this.numeroRue = numbRue;
        this.libelleRue = libRue;
        this.codePostal = code;
        this.ville = ville;
    }
}
