import Manager.Manager;
import Manager.ManagerPostgre;
import gui.Formulaire;

import javax.swing.*;
import java.awt.*;

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

        addAction(main, btn1);

        addAction(main, btn2);

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

        Manager manager = new ManagerPostgre("root", "");
    }

    private static void addAction(Main main, JButton btn) {
        btn.addActionListener(action -> {
            form = new Formulaire("Ajouter Produit");
            form.addField("Désignation :");
            form.addField("Prix");
            form.addField("Quantite");
            JButton retour = form.addButton("Retour");
            JButton valider = form.addButton("Valider");

            main.setVisible(false);
            form.setVisible(true);
        });
    }
}
