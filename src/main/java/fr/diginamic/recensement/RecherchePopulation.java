package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulation extends MenuService{

    @Override
    public void Traiter(Recensement recensement, Scanner scan, int choice) {
        String input = scan.next();
        switch (choice){
            case 1:

                for(Ville v: recensement.get_villeList()){
                    if(v.get_nomComu().equalsIgnoreCase(input)){
                        System.out.println("La commune "+v.get_nomComu()+" a "+v.get_pop()+" habitants");
                    }
                }
                break;
            case 2:
                long total = 0;
                for(Ville v: recensement.get_villeList()){
                    if(v.get_codeDepart().equalsIgnoreCase(input)){
                        total += v.get_pop();
                    }
                }
                System.out.println("Population totale de du département "+input+" | "+total+" habs");
                break;
            case 3:
                total = 0;
                for(Ville v: recensement.get_villeList()){
                    if(v.get_nomRegion().equalsIgnoreCase(input)){
                        total += v.get_pop();
                    }
                }
                System.out.println("Population totale de la région "+input +" | "+total+" habs");
                break;
            default:
            System.out.println("Error");
        }
    }
}
