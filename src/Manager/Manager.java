package Manager;

import java.sql.*;

public abstract class Manager {
    private Connection connection = null;
    private Statement etat ;
    private String query;

    private ResultSet resultSet;

    public Manager(String url, String user, String password){
        try {
            connection = DriverManager.getConnection(
                    url,
                    user,
                    password
            );
            etat = connection.createStatement();
        } catch (SQLException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
    public void insert(String nom, int qte, Double prix) {
        query = "INSERT INTO Produit(nom, qte, prix_unitaire) VALUES(" + nom + ", " + qte + ", " + ", " + prix + ")";
        try {
            etat.executeUpdate(query);
        } catch (SQLException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }

    public ResultSet lire() {
        query = "SELECT * FROM Produit";
        try {
            resultSet = etat.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            System.err.println("Erreur : " + e);
        }
        return null;
    }

    public ResultSet lire(String nom){
        query = "SELECT * FROM Produit WHERE nom = " + nom;
        try {
            resultSet = etat.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        return null;
    }

    public void update(String nom, int qte, Double prix){
        query = "UPDATE Produit SET nom = " + nom + ", qte = " + qte + ", prix_unitaire = " + prix + " WHERE nom = " + nom;
        try {
            etat.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Erreur : " + e);
        }
    }

    public void delete(String nom){
        query = "DELETE FROM Produit WHERE nom = " + nom;
        try {
            etat.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Erreur : " + e);
        }
    }
}
