package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    MBankingApplication application = MBankingApplication.getInstance();
    @FXML
    private Button logout;
    @FXML
    private Label labelNama;
    @FXML
    private Label labelNoRek;
    @FXML
    private Button buttonInfo;
    @FXML
    private Button buttonTransfer;
    @FXML
    private Button buttonPayment;
    @FXML
    private Button buttonAkun;

    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        renderInfo();
    }

    public void renderInfo(){
        labelNama.setText(Data.akun.getNamaNasabah());
        labelNoRek.setText(Data.akun.getNoRek());
    }

    public void toTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toAkunSaya(ActionEvent event) throws IOException {
        application.changeScene("menuAkunSaya.fxml");
    }

    public void toInfo(ActionEvent event) throws IOException {
        application.changeScene("menuInfoRekening.fxml");
    }

    public void toPayment(ActionEvent event) throws IOException {
        application.changeScene("menuPayment.fxml");
    }

    public void logout(ActionEvent event) throws  IOException {
        Data.akun = null;
        application.changeScene("loginRegister/login.fxml");
    }

}
