public abstract class DocumentCommercial {
    private long numero;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    private Client client;

    public Detail getDetail() {
        return detail;
    }

    private Detail detail;

    public abstract double getTotal();

    public abstract double getTVA();
}
