package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/main/java/fichier/recensement.csv");
        List<String> fileLines = Files.readAllLines(filePath);
        List<String> first100Lines = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            first100Lines.add(fileLines.get(i));
        }

        Path first100path = Paths.get("src/main/java/fichier/first100.txt");
        if(!Files.exists(first100path)){
            File First100 = new File("src/main/java/fichier/first100.txt");
            First100.createNewFile();
        }

        Files.write(first100path, first100Lines);
    }
}
