package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class blokirBerhasil implements Initializable {
    public blokirBerhasil(){

    }
    MBankingApplication application = MBankingApplication.getInstance();
    AkunData akunData = new AkunData();

    @FXML
    private Button logout;

    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        blokir();
    }

    public void blokir() {
        System.out.println(Data.akun.getUsername());
        akunData.deleteAkun(Data.akun.getUsername());
        Data.akun = null;
    }

    public void logout(ActionEvent event) throws IOException {
        application.changeScene("loginRegister/login.fxml");
    }
}
