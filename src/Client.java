public class Client extends Person {
    private String numero;

    public Client(String nom, String prenom, Adresse adresse, String numero) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.numero = numero;
    }
}
