import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        /**
         *  KALUFYA KASEYA FERLAY  MSI
         *  KAWEJ A MBAY EXCELLENCE  SI
         *  KASONGO KILONGO AARON  SI
         *  KAPENDA MUTALENU JEAN-MARC MSI
         *  KASESA MUGIMBA HYACINTHE  MSI
         *  KATELE KASAMA ELIE  MSI
         *  MENDJE UPUKU FLORIBERT  MSI
         *  KASONGO MWABILA VELCIA
         *
         */


        Adresse adresse = new Adresse();
        adresse.setAvenue("Hewa Bora");
        Client cl = new Client("Excellence", "kawej", adresse, "01");

        Product<String> p = new Product<>();
        p.setCode("01");
        p.setUniteMesure("Chaîne");
        p.setDesignation("Biscuit");
        p.setPrix(20);
        p.setDateExpiration(new Date());

        Product<String> p1 = new Product<>();
        p1.setCode("02");
        p1.setUniteMesure("Chaîne");
        p1.setDesignation("Pomme");
        p1.setPrix(30);
        p1.setDateExpiration(new Date());

        Ligne l = new Ligne();
        l.setNumero(1);
        l.setProduit(p);
        l.setQuantite(3);

        //System.out.println(l);

        Ligne l1 = new Ligne();
        l1.setNumero(2);
        l1.setProduit(p1);
        l1.setQuantite(4);

        List<Ligne> liste = new ArrayList<>();
        liste.add(l);
        liste.add(l1);

        Detail det = new Detail();
        det.ligne = liste;

        Facture fac = new Facture(01, cl, det);

        System.out.println(fac);

    }


}
