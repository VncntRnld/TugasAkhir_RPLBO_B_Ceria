package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class internetController {
    public internetController() {
    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonLanjut;
    @FXML
    private TextField inputID;
    @FXML
    private TextField inputNama;
    @FXML
    private TextField inputNoTelp;
    @FXML
    private TextField inputNominal;
    @FXML
    private Label warning;

    public void toMenuPayment(ActionEvent event) throws IOException {
        application.changeScene("menuPayment.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        if (inputID.getText().isEmpty() || inputNama.getText().isEmpty() || inputNoTelp.getText().isEmpty() || inputNominal.getText().isEmpty()){
            warning.setText("Please input your data");
        } else if (Integer.parseInt(inputNominal.getText()) >= Data.akun.getSaldo()) {
            warning.setText("Saldo NOT enough");
        } else {
            Data.scene = "internet";
            application.changeScene("pin.fxml");
        }
    }

}
