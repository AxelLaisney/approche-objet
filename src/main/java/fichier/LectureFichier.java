package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/main/java/fichier/recensement.csv");
        List<String> fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        ArrayList<Ville> villes = new ArrayList<>();

        Path sortedCities = Paths.get("src/main/java/fichier/sortedCities.txt");
        if(!Files.exists(sortedCities)){
            File sortedCitiesFile = new File("src/main/java/fichier/sortedCities.txt");
            sortedCitiesFile.createNewFile();
        }

        boolean headFile = true;

        for(String f: fileContent){
            if(headFile == false){
                String[] data = f.split(";");
                if(Integer.parseInt(data[9].trim().replaceAll(" ", "")) > 25000 ){
                    villes.add(new Ville(data[6], data[0], data[1], data[9]));
                }
            }

            headFile = false;
        }
        String head = "Nom de la ville | Code du département | Nom de la region | Population totale";
        List<String> lines = new ArrayList<>();

        lines.add(head);
        Files.write(sortedCities, head.getBytes());
        for(Ville v: villes){
            lines.add(v.FormatedDisplay());
        }

        Files.write(sortedCities, lines, StandardOpenOption.APPEND);
    }
}
