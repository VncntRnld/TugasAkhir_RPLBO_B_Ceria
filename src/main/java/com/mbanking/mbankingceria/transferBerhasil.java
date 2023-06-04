package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.AkunCeria;
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

public class transferBerhasil implements Initializable {

    public transferBerhasil() {

    }

    MBankingApplication application = MBankingApplication.getInstance();
    NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
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
        // Biar update kalo ganti kesini 😗
        Data.akun.transfer(Data.noRekTujuan, Data.tfNominal);

        renderInfo();
    }

    public void renderInfo(){
        Data data = new Data();
        labelNama.setText(data.getAkunTujuan().getNamaNasabah());
        labelNoRek.setText(data.getAkunTujuan().getNoRek());

        //Tanggal realtime 😌
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime tanggal = LocalDateTime.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime waktu = LocalDateTime.now();
        labelTanggal.setText(date.format(tanggal));
        labelWaktu.setText(time.format(waktu));

        // ADD MUTASI 1.akunDipakai, 2.Tujuan 👁️👄👁️
        Data.akun.addMutasiData(new Mutasi(date.format(tanggal), "Transfer ke: "+data.getAkunTujuan().getNamaNasabah(), Data.tfNominal, Data.akun.getSaldo()));
        data.getAkunTujuan().addMutasiData(new Mutasi(date.format(tanggal), "Transfer dari: "+Data.akun.getNamaNasabah(), Data.tfNominal, data.getAkunTujuan().getSaldo()));

        long nominal = Data.tfNominal;
        labelNominal.setText("Rp " + nf.format(nominal));

        if (data.getAkunTujuan() instanceof AkunCeria){
            labelBank.setText("Ceria Bank");
        }
        else {
            labelBank.setText("Cemberut Bank");
        }

        // Biaya Admin 😒
        if (data.getAkunTujuan() instanceof AkunCeria){
            labelAdmin.setText("Rp 0");
        }
        else {
            labelAdmin.setText("Rp 2.500");
        }

        // Total 😗
        if (data.getAkunTujuan() instanceof AkunCeria){
            long totalSesama = Data.tfNominal;
            labelTotal.setText("Rp " + nf.format(totalSesama));
        }
        else {
            long totalBeda = Data.tfNominal + 2500;
            labelTotal.setText("Rp " + nf.format(totalBeda));
        }

        // Berita
        labelBerita.setText(Data.tfBerita);

        clearData();
    }

    public void clearData() {
        // Pembersihan... 🧹
        Data.noRekTujuan = null;
        Data.tfBerita = "";
        Data.tfNominal = 0;
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }

}
