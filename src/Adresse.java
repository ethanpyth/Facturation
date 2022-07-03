import fichier.Fichier;
public class Adresse {
    private static int inNum = 0;
    private String avenue = "";
    private String numero = "";
    private String cellule = "";
    private String quartier = "";

    public Adresse(String commune, String quartier, String avenue) {
        setCommune(commune);
        setQuartier(quartier);
        setAvenue(avenue);
        setNumero(String.valueOf(makeNum()));
        ecrireLigne();
    }

    public void ecrireLigne() {
        Fichier f = new Fichier("adresses.csv");

        f.ecrire("\n" + getNumero() + ";" + getAvenue() + ";" + getCellule() + ";" + getQuartier() + ";" + getCommune() + ";" + getVille() + ";" + getPays());
    }

    public static int makeNum() {
        inNum += 1;
        return inNum;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCellule() {
        return cellule;
    }

    public void setCellule(String cellule) {
        this.cellule = cellule;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    private String commune = "";
    private String ville = "";
    private String pays = "";
}
