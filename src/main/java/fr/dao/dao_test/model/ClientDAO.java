package fr.dao.dao_test.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    public ClientDAO(){ }

    public void insert(Client cli) {
        // méthode d'insertion
        try {
            String url = "jdbc:mysql://localhost:3307/hotel";
            Connection con = DriverManager.getConnection(url, "root", "tiger");

            PreparedStatement stm = con.prepareStatement("INSERT INTO client (cli_nom, cli_prenom, cli_ville) VALUES (?, ?, ?)");

            stm.setString(1, cli.getNom());
            stm.setString(2, cli.getPrenom());
            stm.setString(3, cli.getVille());

            stm.execute();

            stm.close();
            con.close();
            System.out.println("l'insertion s’est bien effectuée");

        }
        catch (Exception e) {
            System.out.println("Erreur lors de l’insertion 'client'");
            System.out.println(e.getMessage());
        }
    }

    public void update(Client cli) {
        // méthode d'édition
    }

    public void delete(Client cli) {
        // méthode de suppression
    }

    public Client find(int id)     {
        // méthode de recherche
        return null;
    }

    public List<Client> list()     {
        // méthode de création de liste
        List<Client> resultat = new ArrayList<Client>();

        try {

            String url = "jdbc:mysql://localhost:3307/hotel";
            Connection con = DriverManager.getConnection(url, "root", "tiger");

            Statement stm = con.createStatement();

            ResultSet result = stm.executeQuery("SELECT * FROM client");

            while (result.next()) {
                Client c = new Client();
                c.setId(result.getInt("cli_id"));
                c.setNom(result.getString("cli_nom"));
                c.setPrenom(result.getString("cli_prenom"));
                resultat.add(c);
            }

            stm.close();
            result.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Erreur de lecture 'client'");
            System.out.println(e.getMessage());
        }

        return resultat;

    }

}
