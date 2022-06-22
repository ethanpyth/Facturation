import java.util.Date;

public class Product <T> {
    private String code;

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

    private String designation;
    private double prix;
    private  T uniteMesure;
    private Date dateExpiration;

    public double getPrix() {
        return prix;
    }

    public void makeCategorie(Categorie cat) {
    }
}
