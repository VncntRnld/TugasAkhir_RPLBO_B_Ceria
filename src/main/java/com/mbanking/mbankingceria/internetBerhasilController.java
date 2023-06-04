package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import com.mbanking.mbankingceria.Model.Mutasi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class internetBerhasilController implements Initializable {
    public internetBerhasilController(){

    }

    MBankingApplication application = MBankingApplication.getInstance();
    NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);

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
        Data data = new Data();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime tanggal = LocalDateTime.now();
        labelTanggal.setText(date.format(tanggal));

        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime waktu = LocalDateTime.now();
        labelWaktu.setText(time.format(waktu));

        labelID.setText(Data.internetID);
        labelNama.setText(Data.internetNama);
        labelNoRek.setText(Data.akun.getNoRek());

        long nominal = Data.internetNominal;
        labelJumlah.setText("Rp " + nf.format(nominal));

        long total = Data.internetNominal + 2500;
        labelTotal.setText("Rp " + nf.format(total));

        // ADD MUTASI
        Data.akun.addMutasiData(new Mutasi(date.format(tanggal), "Payment Indihome", Data.internetNominal+2500, Data.akun.getSaldo()));
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
