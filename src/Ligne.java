public class Ligne {
    private int numero;
    private int quantite;

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

    public Product getProduit() {
        return produit;
    }

    public void setProduit(Product produit) {
        this.produit = produit;
    }

    private Product produit;

    public double getPrixTotal() {
        return produit.getPrix() * quantite;
    }
}
