package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class pinController {
    public pinController(){

    }
    Main m = new Main();
    @FXML
    private Button buttonBack;

    @FXML
    private PasswordField PIN;

    public void toMainMenu(ActionEvent event) throws IOException {
        m.changeScene("mainMenu.fxml");
    }
}
