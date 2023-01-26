package fr.dao.dao_test.gui;

import fr.dao.dao_test.model.Client;
import fr.dao.dao_test.model.ClientDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");


    }
}