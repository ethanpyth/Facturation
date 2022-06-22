public class Facture extends DocumentCommercial{

    public Facture(long numero, Client cl, Detail dt) {
        setNumero(numero);
        setClient(cl);
        setDetail(dt);
    }
    @Override
    public double getTotal() {
        double t = 0;
        for(Ligne i: getDetail().ligne){
            t += i.getPrixTotal();
        }
        return t;
    }

    @Override
    public double getTVA() {
        return  (getTotal() *16/100) + getTotal();
    }
}
