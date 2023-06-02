package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class transaksiBerhasil implements Initializable {

    public transaksiBerhasil() {

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonMainMenu;
    @FXML
    private Label labelNoRek;
    @FXML
    private Label labelNama;
    @FXML
    private Label labelTanggal;
    @FXML
    private Label labelWaktu;
    @FXML
    private Label labelBank;
    @FXML
    private Label labelNominal;
    @FXML
    private Label labelAdmin;
    @FXML
    private Label labelTotal;
    @FXML
    private Label labelBerita;


    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        renderInfo();
    }

    public void renderInfo(){
        labelNama.setText(Data.akun.getNamaNasabah());
        labelNoRek.setText(Data.akun.getNoRek());
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime tanggal = LocalDateTime.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime waktu = LocalDateTime.now();
        labelTanggal.setText(date.format(tanggal));
        labelWaktu.setText(time.format(waktu));

    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }

}
