import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

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

        Scanner in = new Scanner(System.in);
        int nbProduit, qte;
        Double prix;
        Adresse adresse;
        String nom, designation;

        do {
            System.out.print("Enetre le nombre de produits : ");
            nbProduit = in.nextInt();
            in.nextLine();

            if (nbProduit < 0) {
                System.out.println("Entrez un nombre correct !");
            }

        }while (nbProduit < 0);

        for (int i=0; i<nbProduit; i++) {
            System.out.println("*** Données du Client ***\n");
            System.out.print("Votre Nom : ");
            nom = in.nextLine();
            System.out.print("Votre Prenom : ");
            String prenom = in.nextLine();
            System.out.print("Votre Avenue : ");
            String avenue = in.nextLine();
            String commune = in.nextLine();
            String quartier = in.nextLine();
            adresse = new Adresse(commune, quartier, avenue);

            Client cl = new Client(nom, prenom, adresse);

            System.out.println("\n*** Données du Produit ***\n");
            System.out.print("Designation : ");
            designation = in.nextLine();
            System.out.print("Quantité : ");
            qte = in.nextInt();
            in.nextLine();
            System.out.print("Prix : ");
            prix = in.nextDouble();
            in.nextLine();

            Product<String> p = new Product<>(designation, prix, new Date());

            Ligne l = new Ligne();
            l.setNumero(1);
            l.setProduit(p);
            l.setQuantite(qte);

            List<Ligne> lignes = new ArrayList<>();
            lignes.add(l);

            Detail det = new Detail();
            det.ligne = lignes;

            Facture fac = new Facture(cl, det);

            System.out.println(fac);
        }

//        Adresse adresse = new Adresse();
//        adresse.setAvenue("Hewa Bora");
//        Client cl = new Client("Excellence", "kawej", adresse, "01");
//
//        Product<String> p = new Product<>();
//        p.setCode("01");
//        p.setUniteMesure("Chaîne");
//        p.setDesignation("Biscuit");
//        p.setPrix(20);
//        p.setDateExpiration(new Date());
//
//        Ligne l = new Ligne();
//        l.setNumero(1);
//        l.setProduit(p);
//        l.setQuantite(3);
//
//        // System.out.println(l);
//
//        List<Ligne> liste = new ArrayList<>();
//        liste.add(l);
//
//        Detail det = new Detail();
//        det.ligne = liste;
//
//        Facture fac = new Facture(01, cl, det);
//
//        System.out.println(fac);


//        String[] tab = {"a", "b", "c"};
//
//        Fichier f = new Fichier("text.csv");
//
//
//
//        for (String e: tab) {
//            f.ecrire(e);
//            f.ecrire(";");
//        }
//        f.ecrire("\n");
//
//        for (String e: tab) {
//            f.ecrire(e);
//            f.ecrire(";");
//        }
//        f.ecrire("\n");
//        f.ecrire("Je suis un petit fou !");
//
//        f.lire();

    }


}
