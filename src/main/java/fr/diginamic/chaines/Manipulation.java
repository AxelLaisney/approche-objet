package fr.diginamic.chaines;

public class Manipulation {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        System.out.println("Premier caractère: "+chaine.charAt(0));
        System.out.println("Taille de la chaine : "+chaine.length());
        System.out.println("Premier index de ; : "+chaine.indexOf(';'));
        int firstSeparator = chaine.indexOf(";");
        String capitalize = chaine.substring(0, 1).toUpperCase() + chaine.substring(1, firstSeparator);
        System.out.println(capitalize);

        String[] data = chaine.split(";");
        for(String d: data){
            System.out.println(d);
        }

        Salarie salarie1 = new Salarie(data[0], data[1], Double.parseDouble(data[2].replaceAll(" ", "")));
        System.out.println(salarie1.get_nom()+" "+ salarie1.get_prenom()+ " "+salarie1.get_salaire());
    }
}
