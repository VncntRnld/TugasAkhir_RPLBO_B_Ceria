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
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.Random;

public class listrikBerhasilController implements Initializable {
    public listrikBerhasilController(){

    }

    MBankingApplication application = MBankingApplication.getInstance();
    NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
    @FXML
    private Button buttonMainMenu;
    @FXML
    private Label labelID;
    @FXML
    private Label labelNama;
    @FXML
    private Label labelTanggalWaktu;
    @FXML
    private Label labelNominal;
    @FXML
    private Label labelRpToken;
    @FXML
    private Label labelKWh;
    @FXML
    private Label labelPajak;
    @FXML
    private Label labelToken;

    public void initialize(URL location, ResourceBundle resources) {
        Data.akun.setSaldo(Data.akun.getSaldo() - Data.listrikNominal);
        // Jalan kalau ganti scene
        renderInfo();
    }

    public void renderInfo(){
        labelID.setText(Data.listrikID);
        labelNama.setText(Data.listrikNama);

        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime tgl = LocalDateTime.now();
        labelTanggalWaktu.setText(datetime.format(tgl));

        long pajak = (long) (Data.listrikNominal*0.02);
        long beli = (Data.listrikNominal - pajak - 2000);
        long nominal = Data.listrikNominal;
        labelNominal.setText("Rp " + nf.format(nominal));
        labelRpToken.setText("Rp " + nf.format(beli));
        labelPajak.setText("Rp " + nf.format(pajak));
        labelKWh.setText(String.valueOf(beli/1000));

        Random random = new Random();
        long token = (long) (1000_0000_0000_0000L + random.nextFloat() * 9000_0000_0000_0000L);
        labelToken.setText(String.valueOf(token));

        // ADD MUTASI
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime tanggal = LocalDateTime.now();
        Data.akun.addMutasiData(new Mutasi(date.format(tanggal), "Payment Listrik", Data.listrikNominal, Data.akun.getSaldo()));
        clearData();
    }

    public void clearData() {
        // Pembersihan 🧹..
        Data.listrikID = "";
        Data.listrikNama = "";
        Data.listrikNominal = 0;
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }
}
