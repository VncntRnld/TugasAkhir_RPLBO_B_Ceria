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

public class internetBerhasilController implements Initializable {
    public internetBerhasilController(){

    }

    MBankingApplication application = MBankingApplication.getInstance();
    @FXML
    private Button buttonMainMenu;
    @FXML
    private Label labelTanggal;
    @FXML
    private Label labelWaktu;
    @FXML
    private Label labelID;
    @FXML
    private Label labelNama;
    @FXML
    private Label labelNoRek;
    @FXML
    private Label labelJumlah;
    @FXML
    private Label labelTotal;

    public void initialize(URL location, ResourceBundle resources) {
        Data.akun.setSaldo(Data.akun.getSaldo() - Data.internetNominal - 2500);

        renderInfo();
    }

    public void renderInfo(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime tanggal = LocalDateTime.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime waktu = LocalDateTime.now();
        labelTanggal.setText(date.format(tanggal));
        labelWaktu.setText(time.format(waktu));
        labelID.setText(Data.internetID);
        labelNama.setText(Data.internetNama);
        labelNoRek.setText(Data.akun.getNoRek());
        labelJumlah.setText(String.valueOf(Data.internetNominal));
        labelTotal.setText(String.valueOf(Data.internetNominal + 2500));

        clearData();
    }

    public void clearData() {
        // Pembersihan 🧹..
        Data.internetNominal = 0;
        Data.internetID = "";
        Data.internetNama = "";
        Data.internetNoTelp = "";
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }
}
