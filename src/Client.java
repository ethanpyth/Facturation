public class Client extends Person {
    private String numero;

    public Client(String nom, String prenom, Adresse adresse, String numero) {
        super(nom, prenom, adresse);
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
