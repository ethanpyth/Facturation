package fichier;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParserFile extends Fichier {

    public ParserFile(String chemin) {
        super(chemin);
    }

    public ArrayList<String> renderEnreg() {
        ArrayList<String> lignes = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(this.getFile());
            while (scanner.hasNextLine()) {
                lignes.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lignes;
    }

    public ArrayList<ArrayList<String>> renderCols() {
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(this.getFile());
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ArrayList<String> colons = new ArrayList<>();
                Scanner colScanner = new Scanner(line);
                colScanner.useDelimiter(";");
                while(colScanner.hasNext()) {
                    colons.add(colScanner.next());
                }
                lines.add(colons);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }

    public ArrayList<ArrayList<String>> renderCustom(ArrayList<Integer> cols) {
        ArrayList<ArrayList<String>> customCols = new ArrayList<>();
        ArrayList<ArrayList<String>> renderCols = renderCols();

        for(ArrayList<String> col: renderCols) {
            ArrayList<String> lineCols = new ArrayList<>();
            for(int i: cols) {
                lineCols.add(col.get(i));
            }
            customCols.add(lineCols);
        }
        return customCols;
    }
}

