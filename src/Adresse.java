public class Adresse {
    private String avenue;
    private String numero;
    private String cellule;
    private String quartier;

    public Adresse(String numero, String avenue, String cellule, String quartier, String commune, String ville, String pays) {
        this.numero = numero;
        this.avenue = avenue;
        this.cellule = cellule;
        this.quartier = quartier;
        this.commune = commune;
        this.ville = ville;
        this.pays = pays;
    }

    public Adresse(){}

    public String getAvenue(String hw) {
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

    @Override
    public String toString() {
        return "Numero : " + this.numero +
                "Avenue : " + this.avenue +
                "Cellule : " + this.cellule +
                "Quartier : " + this.quartier +
                "Commune : " + this.commune +
                "Ville : " + this.ville +
                "Pays : " + this.pays;
    }

    private String commune;
    private String ville;
    private String pays;
}
