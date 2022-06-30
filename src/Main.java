import mesure.IUnitMesure;

import java.util.*;

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
        double prix;
        Adresse adresse;
        String nom, designation;

        String c;
        do {
            System.out.println("*** Données du client ***\n");
            System.out.println("Votre nom : ");
            nom = in.nextLine();
            System.out.println("Votre prenom : ");
            String prenom = in.nextLine();
            System.out.println("Votre avenue : ");
            String avenue = in.nextLine();
            System.out.println("Votre commune : ");
            String commune = in.nextLine();
            System.out.println("Votre quartier : ");
            String quartier = in.nextLine();
            adresse = new Adresse(commune, quartier, avenue);
            Client client = new Client(nom, prenom, adresse);
            int count = 1;
            Detail dt;
            do {
                System.out.println("*** Données des Produits ***\n");
                System.out.println("Désignation : ");
                designation = in.nextLine();
                System.out.println("Quantité : ");
                qte = in.nextInt();
                System.out.println("Prix : ");
                prix = in.nextDouble();
                Product<IUnitMesure> produit = new Product<>(designation, prix, new Date());
                Ligne l = new Ligne();
                l.setQuantite(qte);
                l.setNumero(count);
                l.setProduit(produit);
                count++;
                List<Ligne> lignes = new ArrayList<>();
                lignes.add(l);
                dt = new Detail();
                dt.ligne = lignes;

                System.out.println("Voulez-vous ajouter un produit? (o pour oui et n pour non) ");
                c = in.next();
            } while (Objects.equals(c, "o"));
            Facture fac = new Facture(client, dt);
            System.out.println(fac);
            System.out.println("Voulez-vous créer une facture? (o pour oui et n pour non) ");
            c = in.next();

        } while (Objects.equals(c, "o"));

//        do {
//            System.out.print("Enetre le nombre de produits : ");
//            nbProduit = in.nextInt();
//            in.nextLine();
//
//            if (nbProduit < 0) {
//                System.out.println("Entrez un nombre correct !");
//            }
//
//        }while (nbProduit < 0);
//
//        for (int i=0; i<nbProduit; i++) {
//            System.out.println("*** Données du Client ***\n");
//            System.out.print("Votre Nom : ");
//            nom = in.nextLine();
//            System.out.print("Votre Prenom : ");
//            String prenom = in.nextLine();
//            System.out.print("Votre Avenue : ");
//            String avenue = in.nextLine();
//            System.out.println("Votre commune : ");
//            String commune = in.nextLine();
//            System.out.println("Votre quartier : ");
//            String quartier = in.nextLine();
//            adresse = new Adresse(commune, quartier, avenue);
//
//            Client cl = new Client(nom, prenom, adresse);
//
//            System.out.println("\n*** Données du Produit ***\n");
//            System.out.print("Designation : ");
//            designation = in.nextLine();
//            System.out.print("Quantité : ");
//            qte = in.nextInt();
//            in.nextLine();
//            System.out.print("Prix : ");
//            prix = in.nextDouble();
//            in.nextLine();
//
//            Product<IUnitMesure> p = new Product<>(designation, prix, new Date());
//
//            Ligne l = new Ligne();
//            l.setNumero(1);
//            l.setProduit(p);
//            l.setQuantite(qte);
//
//            List<Ligne> lignes = new ArrayList<>();
//            lignes.add(l);
//
//            Detail det = new Detail();
//            det.ligne = lignes;
//
//            Facture fac = new Facture(cl, det);
//
//            System.out.println(fac);
//        }

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
