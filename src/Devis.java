public class Devis extends DocumentCommercial{
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
