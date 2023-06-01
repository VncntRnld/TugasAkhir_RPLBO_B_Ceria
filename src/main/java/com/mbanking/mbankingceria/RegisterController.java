package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    private Label warning01;
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
    private Label warning02;
    @FXML
    private Button submit;

    // 03
    private AkunData akunData = new AkunData();
    private Akun akunBaru;

    public void moveSignIn(ActionEvent event) throws IOException {
        m.changeScene("Login.fxml");
    }

    public void moveNextForm(ActionEvent event) throws IOException {
        if (inputNama.getText().isEmpty() || inputNIK.getText().isEmpty() || inputTglLahir.getText().isEmpty() || inputDomisili.getText().isEmpty() || inputNoTelp.getText().isEmpty()){
            warning01.setText("Please enter your data..");
        }
        else {
            akunBaru = new Akun(inputNama.getText(), inputNIK.getText(), inputTglLahir.getText(), inputDomisili.getText(), inputNoTelp.getText());
            Data.akun = akunBaru;
            m.changeScene("Register02.fxml");
        }
    }

    public void toRegister(ActionEvent event) throws IOException {
        m.changeScene("Register.fxml");
    }

    public void submitForm(ActionEvent event) throws IOException {

        if (inputUsername.getText().isEmpty() || inputPassword.getText().isEmpty() || inputPIN.getText().isEmpty()) {
            warning02.setText("Please enter your data..");
        }
        else if (!inputPassword.getText().equals(inputConfirm.getText())){
            warning02.setText("Password do NOT match!");
        }
        else {
            akunBaru = Data.akun;

            System.out.println(akunBaru);
            akunBaru.setUsername(inputUsername.getText());
            akunBaru.setPassword(inputPassword.getText());
            akunBaru.setPIN(inputPIN.getText());

            akunData.addAkun(akunBaru);

            m.changeScene("loginRegister/Login.fxml");
        }

    }


}
