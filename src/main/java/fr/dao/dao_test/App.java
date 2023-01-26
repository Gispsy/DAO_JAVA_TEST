package fr.dao.dao_test;

import fr.dao.dao_test.model.Client;
import fr.dao.dao_test.model.ClientDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fr/dao/dao_test/Test.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu Test!");
        stage.setScene(scene);
        stage.setResizable(false);

        Client c = new Client();
        c.setNom("Lebowski");
        c.setPrenom("Jeffrey");
        c.setVille("Los Angeles");

        ClientDAO repo = new ClientDAO();

        repo.insert(c);

        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }

}
