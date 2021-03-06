import mesure.IUnitMesure;

public class Ligne {

    private Product<IUnitMesure> produit;
    private int numero;
    private int quantite;

    public Ligne(int quantite, Product<IUnitMesure> produit){
        this.quantite = quantite;
        this.produit = produit;
    }

    public Ligne() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Product<IUnitMesure> getProduit() {
        return produit;
    }

    public void setProduit(Product<IUnitMesure> produit) {
        this.produit = produit;
    }

    public double getPrixTotal() {
        return produit.getPrix() * quantite;
    }

    @Override
    public String toString() {
        return this.numero + " | " + this.quantite + " | " + produit.getDesignation();
    }
}
