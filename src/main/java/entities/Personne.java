package entities;

public class Personne {
    String lastName;
    String firstName;
    AdressePostale adresse;

    public Personne(String lName, String fName, AdressePostale adresse){
        this.lastName = lName;
        this.firstName = fName;
        this.adresse = adresse;
    }

    public Personne() { this("dsad", "dasd", new AdressePostale("dasd", "dasda", "dasd", "dasd"));}

    public void Display(){
        System.out.println(this.lastName.toUpperCase() + " "+ this.firstName);
    }

    public void ChangeLastName(String n){
        this.lastName = n;
    }

    public void ChangeAdresse(AdressePostale a){
        this.adresse = a;
    }

    public void ChangeFirstName(String n){
        this.firstName = n;
    }

    public String GetLastName(){
        return this.lastName;
    }

    public String GetFirstName(){
        return this.firstName;
    }

    public AdressePostale GetAdresse(){
        return this.adresse;
    }
}
