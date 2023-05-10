package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    @FXML
    private Hyperlink toRegister;
    Main m = new Main();

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogIn();
    }

    private void checkLogIn() throws IOException {
        if (username.getText().toString().equals("Admin") && password.getText().toString().equals("admin")){
            m.changeScene("mainMenu.fxml");
        }
        else if (username.getText().isEmpty() && password.getText().isEmpty()){
            loginMsg.setText("Please enter your data");
        }
        else {
            loginMsg.setText("Username or Password Invalid");
        }

    }

    public void moveRegister(ActionEvent event) throws IOException{
        m.changeScene("Register.fxml");
    }

}
