package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.AkunCeria;
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

public class transferBerhasil implements Initializable {

    public transferBerhasil() {

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

        labelNominal.setText(String.valueOf(Data.tfNominal));

        // Biaya Admin 😒
        if (data.getAkunTujuan() instanceof AkunCeria){
            labelAdmin.setText("0");
        }
        else {
            labelAdmin.setText("2500");
        }

        // Total 😗
        if (data.getAkunTujuan() instanceof AkunCeria){
            labelTotal.setText(String.valueOf(Data.tfNominal));
        }
        else {
            labelTotal.setText(String.valueOf(Data.tfNominal+2500));
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
