import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import fichier.Fichier;
import fichier.ParserFile;

public class Product <T> {
    private String filePath;
    private String designation;
    private double prix;
    private  T uniteMesure;
    private Date dateExpiration;
    private static int inCode = 0;

    private String code;
    private Categorie categorie;
    public Product(String code, String designation, double prix, Categorie categorie, T uniteMesure, Date dateExpiration){
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.categorie = categorie;
        this.uniteMesure = uniteMesure;
        this.dateExpiration = dateExpiration;
        this.filePath = "products.csv";
    }

    public Product(String code, String designation, double prix) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.filePath = "products.csv";
    }

    public Product(String designation, double prix, Date dateExpiration) {
        this.setCode(String.valueOf(makeCode()));
        this.setDesignation(designation);
        this.setPrix(prix);
        this.setDateExpiration(dateExpiration);
        this.filePath = "products.csv";
        ecrireLigne();
    }

    public ArrayList<ArrayList<String>> getAll() {
        ParserFile file = new ParserFile(this.filePath);
        return file.renderCols();
    }

    private static int makeCode() {
        inCode += 1;
        return inCode;
    }

    public void ecrireLigne() {
        Fichier f = new Fichier(this.filePath);
        f.ecrire("\n" + code + ";" + designation + ";" + prix + ";" + dateExpiration);
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }



    public double getPrix() {
        return prix;
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
