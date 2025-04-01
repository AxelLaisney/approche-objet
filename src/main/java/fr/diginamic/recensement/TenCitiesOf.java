package fr.diginamic.recensement;

import fr.diginamic.recensement.comparator.NomVilleComparator;
import fr.diginamic.recensement.comparator.PopulationComparator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenCitiesOf extends MenuService{
    @Override
    public void Traiter(Recensement recensement, Scanner scan, int choice) {
        String input = "";
        int i;
        switch (choice){
            case 6:
                input = scan.next();
                List<Ville> vDepart = new ArrayList<>();
                System.out.println("Les 10 villes les plus peuplées du "+input);
                recensement.get_villeList().sort(new NomVilleComparator());
                recensement.get_villeList().sort(new PopulationComparator());
                recensement.set_villeList(recensement.get_villeList().reversed());
                for(Ville v: recensement.get_villeList()){
                    if(v.get_codeDepart().equalsIgnoreCase(input)){
                        vDepart.add(v);

                    }
                }
                for( i = 1; i < 11; i++){
                    System.out.println(i + " "+vDepart.get(i-1).get_nomComu()+" | nombres habitants: "+vDepart.get(i-1).get_pop());
                }


                break;
            case 7:
                input = scan.next();
                List<Ville> vRegion = new ArrayList<>();
                System.out.println("Les villes les plus peuplées de"+input);
                recensement.get_villeList().sort(new NomVilleComparator());
                recensement.get_villeList().sort(new PopulationComparator());
                recensement.set_villeList(recensement.get_villeList().reversed());
                for(Ville v: recensement.get_villeList()){
                    if(v.get_nomRegion().equalsIgnoreCase(input)){
                        vRegion.add(v);
                    }
                }
                for(i = 1; i < 11; i++){
                    System.out.println(i + " "+vRegion.get(i-1).get_nomComu()+" | nombres habitants: "+vRegion.get(i-1).get_pop());
                }
                break;
            case 8:
                System.out.println("Les 10 villes les plus peuplées de France");
                recensement.get_villeList().sort(new NomVilleComparator());
                recensement.get_villeList().sort(new PopulationComparator());
                recensement.set_villeList(recensement.get_villeList().reversed());
                for(i = 1; i < 11; i++){
                    System.out.println(i+ " "+recensement.get_villeList().get(i-1).get_nomComu()+" | nombres habitants: "+recensement.get_villeList().get(i-1).get_pop());
                }
                break;
            default:
                System.out.println("Error");
        }
    }
}
