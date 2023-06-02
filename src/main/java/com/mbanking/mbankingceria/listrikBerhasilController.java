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

public class listrikBerhasilController implements Initializable {
    public listrikBerhasilController(){

    }
    MBankingApplication application = MBankingApplication.getInstance();

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
    private Label labelPajak;
    @FXML
    private Label labelToken;

    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        renderInfo();
    }

    public void renderInfo(){
        labelID.setText(Data.akun.getNIK());
        labelNama.setText(Data.akun.getNamaNasabah());
        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime tgl = LocalDateTime.now();
        labelTanggalWaktu.setText(datetime.format(tgl));
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }
}
