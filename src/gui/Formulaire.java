package gui;

import javax.swing.*;
import java.awt.*;

public class Formulaire extends JFrame {
    private JLabel titleLabel;
    private JButton valid;
    private JButton cancel;
    public Formulaire(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.titleLabel = new JLabel(title);
        this.titleLabel.setPreferredSize(new Dimension(20, 20));
        this.getContentPane().add(titleLabel);
        this.setLocationRelativeTo(null);
    }

    public JTextField addField(String text) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel gridPanel = new JPanel(new GridLayout(1, 2, 5, 0));
        panel.add(gridPanel);
        JLabel label = new JLabel(text);
        JTextField field = new JTextField();
        gridPanel.add(label);
        gridPanel.add(field);
        this.getContentPane().add(panel);
        return field;
    }

    public JButton addButton(String v) {
        this.valid = new JButton(v);
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 2));
        flowPanel.add(valid);
        this.getContentPane().add(flowPanel);
        return valid;
    }
}
