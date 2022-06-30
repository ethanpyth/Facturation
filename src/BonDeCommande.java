public class BonDeCommande extends DocumentCommercial{
    @Override
    public double getTVA() {
        return  (getTotal() *16/100) + getTotal();
    }
}
