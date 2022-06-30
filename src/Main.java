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


        String c;
        do {
            int nbProduit, qte;
            double prix;
            Adresse adresse;
            String nom, designation;
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
