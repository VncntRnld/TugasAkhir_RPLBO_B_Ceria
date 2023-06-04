package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


public class infoSaldoController implements Initializable {
    public infoSaldoController(){

    }
    MBankingApplication application = MBankingApplication.getInstance();
    NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);

    @FXML
    private Button buttonBack;
    @FXML
    private Label labelSaldo;
    @FXML
    private Label labelTglSaldo;

    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        renderInfo();
    }

    private void renderInfo() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        labelTglSaldo.setText(dtf.format(now));

        long saldo = Data.akun.getSaldo();
        labelSaldo.setText("Rp " + nf.format(saldo));
    }

    public void toMenuInfoRekening(ActionEvent event) throws IOException{
        application.changeScene("menuInfoRekening.fxml");
    }
}
