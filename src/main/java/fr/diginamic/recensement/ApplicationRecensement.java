package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Path filePath = Paths.get("src/main/java/fr/diginamic/recensement/files/recensement.csv");
        List<String> fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        Recensement recensement = new Recensement();
        boolean isHead = true;
        for (String l: fileContent){
            if(!isHead){
                String[] data = l.split(";");
                recensement.AddCities(new Ville(data[1], data[6], data[0], data[2], data[5], data[9]));
            }
            isHead = false;
        }

        System.out.println("Veuillezs choisir une option: ");
        int choice = 0;
        while(choice != 9){
            MainMenu();
            choice = scan.nextInt();
            if(choice > 0 && choice < 10){
                if(choice > 0 && choice < 4){
                    System.out.println("Entrez le nom de la ville ou le code département|region");
                    RecherchePopulation re = new RecherchePopulation();
                    re.Traiter(recensement, scan, choice);
                }else if(choice > 3 && choice < 6){
                    System.out.println("Entrez le code de la région|département");
                    TenOf re = new TenOf();
                    re.Traiter(recensement, scan, choice);
                }else if(choice > 5 && choice < 8){
                    System.out.println("Entrer le code région|département");
                    TenCitiesOf re = new TenCitiesOf();
                    re.Traiter(recensement, scan, choice);
                }else if(choice == 8){
                    TenCitiesOf re = new TenCitiesOf();
                    re.Traiter(recensement, scan, choice);
                }
            }else{
                System.out.println("Enter valid option");
            }
        }


    }
    public static void MainMenu(){
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir");
    }
}
