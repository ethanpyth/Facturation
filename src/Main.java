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
        Scanner input = new Scanner(System.in);

        Adresse adresseClient = new Adresse();
        Scanner quit = new Scanner(System.in);
        String value;
        int count = 0;
        do {
            count += 1;

            System.out.println("Entrez le nom du client : ");
            String nomClient = input.next();
            System.out.println("Entrez le prenom du client : ");
            String prenom = input.next();
            Client client = new Client(nomClient, prenom, adresseClient, "1");

            Detail detailFacture = new Detail();
            Scanner addProduct = new Scanner(System.in);
            String addBool;
            Facture fact = new Facture(count, client, detailFacture);
            do {
                System.out.println("Entrez le nom du produit : ");
                String nomProduit = input.next();
                Product<mesure.IUnitMesure> produit = new Product<mesure.IUnitMesure>("44", nomProduit, 800);
                System.out.println("Entrez la quatité : ");
                int qteProduit = input.nextInt();
                Ligne ligneFact = new Ligne(qteProduit, produit);
                detailFacture.ligne.add(ligneFact);
                System.out.println("Voulez ajouter un autre produit (o pour oui /N pour non) :");
                addBool = addProduct.next();
            } while (Objects.equals(addBool, "o"));
            System.out.println("Entrez O pour continuer et N pour quitter : ");
            value = input.next();
        } while (Objects.equals(value, "o"));
    }
}
