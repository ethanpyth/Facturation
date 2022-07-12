import gui.Formulaire;
import mesure.IUnitMesure;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main extends JFrame{
    private static Formulaire form;
    public Main() {
        this.setTitle("Facturation");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
    }

    public static JButton addButton(String text, JPanel container) {
        JButton btn = new JButton(text);
        container.add(btn);
        return btn;
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.setLayout(new FlowLayout());
        JButton btn1 = addButton("Ajouter", (JPanel) main.getContentPane());
        JButton btn2 = addButton("Modifier", (JPanel) main.getContentPane());

        main.setVisible(true);

        btn1.addActionListener(action -> {
            form = new Formulaire("Ajouter Produit");
            form.addField("Nom");
            form.addField("PostNom");
            form.addField("Les juste voir");
            form.addButton("Valider");

            main.setVisible(false);
            form.setVisible(true);
        });


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

        Manager manager = new Manager();




//        String column[] = {"Désignation", "Quantité", "Prix unitaire", "Total"};
//        JFrame window = new JFrame("Facturation");
//        window.setLocationRelativeTo(null);
//        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        window.setResizable(false);
//        window.setVisible(true);
//        window.setSize(500,400);
//        window.setLayout(new BorderLayout());
//        JPanel panel = new JPanel();


//        panel.setLayout(new FlowLayout());
//        window.getContentPane().add(panel);
//        panel.add(new JLabel("Facture"), BorderLayout.NORTH);

//        Scanner in = new Scanner(System.in);
//
//        String c;
//
//        do {
//            int qte;
//            double prix;
//            Adresse adresse;
//            String nom, designation;
//            System.out.println("*** Données du client ***\n");
//            System.out.println("Votre nom : ");
//            nom = in.nextLine();
//            System.out.println("Votre prenom : ");
//            String prenom = in.nextLine();
//            System.out.println("Votre avenue : ");
//            String avenue = in.nextLine();
//            System.out.println("Votre commune : ");
//            String commune = in.nextLine();
//            System.out.println("Votre quartier : ");
//            String quartier = in.nextLine();
//            adresse = new Adresse(commune, quartier, avenue);
//            Client client = new Client(nom, prenom, adresse);
//            int count = 1;
//            Detail dt;
////            ArrayList<List<Ligne>> dtList = null;
//            do {
//                System.out.println("*** Données des Produits ***\n");
//                System.out.println("Désignation : ");
//                designation = in.nextLine();
//                System.out.println("Quantité : ");
//                qte = in.nextInt();
//                System.out.println("Prix : ");
//                prix = in.nextDouble();
//                manager.insert(designation, qte, prix);
//                Product<IUnitMesure> produit = new Product<>(designation, prix, new Date());
//                Ligne l = new Ligne();
//                l.setQuantite(qte);
//                l.setNumero(count);
//                l.setProduit(produit);
//                count++;
//                List<Ligne> lignes = new ArrayList<>();
//                lignes.add(l);
//                dt = new Detail();
//                dt.ligne = lignes;
////                assert false;
////                dtList.add(lignes);
//                System.out.println("Voulez-vous ajouter un produit? (o pour oui et n pour non) ");
//                c = in.next();
//            } while (Objects.equals(c, "o"));
////            String data[][] = (String[][]) dtList;
//            String data[][]={
//                    {"101","Amit","670000"},
//                    {"102","Jai","780000"},
//                    {"101","Sachin","700000"}
//            };
//            Facture fac = new Facture(client, dt);
//            System.out.println(fac);
////            JTable facture = new JTable(data, column);
////            facture.setBounds(10, 10, 400, 400);
////            JScrollPane sp = new JScrollPane(facture);
////            content.add(facture);
////            window.getContentPane().add(sp, BorderLayout.CENTER);
//            System.out.println("Voulez-vous créer une facture? (o pour oui et n pour non) ");
//            c = in.next();
//        } while (Objects.equals(c, "o"));


    }
}
