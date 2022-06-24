public abstract class DocumentCommercial {
    private long numero;

    public DocumentCommercial(Long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

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

    public double getTotal() {
        double t = 0;
        for(Ligne i: getDetail().ligne){
            t += i.getPrixTotal();
        }
        return t;
    }

    public double getTVA() {
        return  (getTotal() *16/100) + getTotal();
    };
}
