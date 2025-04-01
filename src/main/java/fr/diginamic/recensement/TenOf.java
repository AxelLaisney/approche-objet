package fr.diginamic.recensement;

import fr.diginamic.recensement.comparator.DepartementComparator;
import fr.diginamic.recensement.comparator.PopulationComparator;
import fr.diginamic.recensement.comparator.RegionComparator;

import java.util.Collections;
import java.util.Scanner;

public class TenOf extends MenuService{
    @Override
    public void Traiter(Recensement recensement, Scanner scan, int choice) {
        switch (choice){
            case 4:
                System.out.println("Les 10 régions les plus peuplées");
                recensement.get_villeList().sort(new RegionComparator());
                recensement.get_villeList().sort(new PopulationComparator());
                recensement.set_villeList(recensement.get_villeList().reversed());
                for(int i = 1; i < 11; i ++){
                    System.out.println(i + " "+ recensement.get_villeList().get(i -1).get_nomRegion());
                }
                break;
            case 5:
                System.out.println("Les 10 département les plus peuplés");
                recensement.get_villeList().sort(new DepartementComparator());
                recensement.get_villeList().sort(new PopulationComparator());
                recensement.set_villeList(recensement.get_villeList().reversed());
                for(int i = 1; i < 11; i++){
                    System.out.println(i+ " "+recensement.get_villeList().get(i -1).get_codeDepart());
                }
                break;
            default:
                System.out.println("Error");
        }
    }
}
