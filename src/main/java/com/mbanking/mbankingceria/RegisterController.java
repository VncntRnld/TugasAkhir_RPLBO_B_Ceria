package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.IOException;

public class RegisterController {

    public RegisterController(){

    }

    @FXML
    private Button nextForm;
    @FXML
    private Hyperlink toSignIn;
    Main m = new Main();

    public void moveSignIn(ActionEvent event) throws IOException {
        m.changeScene("Login.fxml");
    }

}
