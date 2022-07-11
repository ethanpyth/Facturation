package fichier;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fichier {
    private String chemin;
    private final File file;

    public Fichier(String chemin) {
        this.chemin = chemin;
        this.file = new File(this.chemin);
    }

    public boolean exist() {
        return this.file.exists();
    }

    public void creer() {
        try {
            if (this.file.createNewFile()) {
                System.out.println("Le fichier a bel et bien été créé");
            } else {
                System.out.println("Erreur lors de la création du fichier");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lire() {
        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ecrire(String phrase) {
        try {
            FileWriter fileWriter = new FileWriter(this.chemin, true);
            fileWriter.append(phrase);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public File getFile() {
        return file;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    @Override
    public String toString() {
        return "Le chemin d'accès à votre fichier est " + this.getChemin();
    }
}
