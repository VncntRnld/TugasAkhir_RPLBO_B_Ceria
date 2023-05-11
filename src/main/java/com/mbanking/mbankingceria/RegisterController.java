package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegisterController {

    public RegisterController(){

    }
    Main m = new Main();

    // 01 form
    @FXML
    private TextField inputNama;
    @FXML
    private TextField inputNIK;
    @FXML
    private TextField inputTglLahir;
    @FXML
    private TextField inputDomisili;
    @FXML
    private TextField inputNoTelp;
    @FXML
    private Button nextForm;
    @FXML
    private Hyperlink toSignIn;

    // 02 form
    @FXML
    private Button buttonBack;
    @FXML
    private TextField inputUsername;
    @FXML
    private PasswordField inputPassword;
    @FXML
    private PasswordField inputConfirm;
    @FXML
    private PasswordField inputPIN;
    @FXML
    private Button submit;


    public void moveSignIn(ActionEvent event) throws IOException {
        m.changeScene("Login.fxml");
    }

    public void moveNextForm(ActionEvent event) throws IOException {
        m.changeScene("Register02.fxml");
    }

    public void toRegister(ActionEvent event) throws IOException {
        m.changeScene("Register.fxml");
    }

    public void submitForm(ActionEvent event) throws IOException {
        m.changeScene("Login.fxml");
    }


}
