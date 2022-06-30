public class Facture extends DocumentCommercial{
    private static long inNum = 0;
    public Facture(Client cl, Detail dt) {
        setNumero(makeNum());
        setClient(cl);
        setDetail(dt);
        stocker(dt, cl);
    }

    public void stocker(Detail dt, Client cl) {
        String dsg = "";
        int qte = 0;
        double prix = 0;
        double prixtT = 0;
        double prixTC = 0;

        for (Ligne l: dt.ligne) {
            qte = l.getQuantite();
            dsg = l.getProduit().getDesignation();
            prix = l.getProduit().getPrix();
            prixtT = l.getPrixTotal();
            prixTC = getTVA();
        }
        ecrireLigne(getNumero(),dsg, qte, prix, prixtT, prixTC, cl.getNumero());
    }

    public void ecrireLigne(long num, String dsg, int qte, double prix, double prixtT, double prixTC, String codeClient) {
        Fichier f = new Fichier("factures.csv");

        f.ecrire("\n" + num + dsg + ";" + qte + ";" + prix + ";" + prixtT + ";" + prixTC + ";" + codeClient);
    }

    public static long makeNum() {
        inNum += 1;
        return inNum;
    }

    @Override
    public double getTVA() {
        return  (getTotal() *16/100) + getTotal();
    }
}
