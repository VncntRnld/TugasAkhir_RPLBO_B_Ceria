package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    public LoginController() {

    }

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label loginMsg;
    @FXML
    private Button signIn;

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogIn();
    }

    private void checkLogIn() throws IOException {
        Main m = new Main();
        if (username.getText().isEmpty() && password.getText().isEmpty()){
            loginMsg.setText("Please enter your data");
        }

    }

}
