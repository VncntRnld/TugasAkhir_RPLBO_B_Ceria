package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class pinController {
    public pinController(){

    }
    MBankingApplication application = MBankingApplication.getInstance();
    @FXML
    private Button buttonBack;
    @FXML
    private PasswordField PIN;
    @FXML
    private Label warning;
    @FXML
    private Button buttonKonfirmasi;

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }

    public void konfirmasiPIN(ActionEvent event) throws IOException {
        if (Data.akun.getPIN().equals(PIN.getText())){
            toBerhasil();
        }
        else if (PIN.getText() == null){
            warning.setText("Please input your PIN");
        }
        else {
            warning.setText("PIN is NOT valid");
        }
    }

    private void toBerhasil() throws IOException {
        if (Data.scene.equals("transfer")) {
            application.changeScene("transferBerhasil.fxml");
        }
        else if (Data.scene.equals("listrik")) {
            application.changeScene("ListrikBerhasil.fxml");
        }
        else if (Data.scene.equals("internet")) {
            application.changeScene("InternetBerhasil.fxml");
        }
        else if (Data.scene.equals("blokir")) {
            application.changeScene("blokirBerhasil.fxml");
        }
        else if (Data.scene.equals("limit")) {
            application.changeScene("limitBerhasil.fxml");
        }
    }

}
