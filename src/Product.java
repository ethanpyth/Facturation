import java.util.Date;

public class Product <T> {
    private String designation;
    private double prix;
    private  T uniteMesure;
    private Date dateExpiration;
    private static int inCode = 0;
    private String code;

    public Product(String designation, double prix, Date dateExpiration) {
        this.setCode(String.valueOf(makeCode()));
        this.setDesignation(designation);
        this.setPrix(prix);
        this.setDateExpiration(dateExpiration);
        ecrireLigne();
    }

    private static int makeCode() {
        inCode += 1;
        return inCode;
    }

    public void ecrireLigne() {
        Fichier f = new Fichier("products.csv");

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

    public void makeCategorie(Categorie cat) {
    }
}
