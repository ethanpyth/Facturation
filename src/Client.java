public class Client extends Person {
    private static int inNum = 0;
    private String numero;

    public Client(String nom, String prenom, Adresse adresse) {
        super(nom, prenom, adresse);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nom : " + this.getNom() +
                "\nPrenom : " + this.getPrenom() +
                "\nAdresse : " + this.getAdresse().getAvenue() +
                "\nNumero : " + numero;
    }
}
