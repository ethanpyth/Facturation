public class BonDeCommande extends DocumentCommercial{
    public BonDeCommande(Long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }
    @Override
    public double getTVA() {
        return  (getTotal() *16/100) + getTotal();
    }

    public String toString() {
        return "Numero : " + this.getNumero() +
                "Client : " + this.getClient() +
                "Detail : " + this.getDetail();
    }
}
