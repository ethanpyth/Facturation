public class Client extends Person {
    private static int inNum = 0;
    private String numero;

    public Client(String nom, String prenom, Adresse adresse) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setNumero(String.valueOf(makeNum()));
    }

    public void ecrireLigne() {
        Fichier f = new Fichier("clients.csv");

        f.ecrire("\n" + getNumero() + ";" + getNom() + ";" + getPrenom() + ";" + getAdresse().getNumero());
    }

    public static int makeNum() {
        inNum += 1;
        return inNum;
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
