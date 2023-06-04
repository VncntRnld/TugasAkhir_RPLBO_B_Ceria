package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class listrikController {

    public listrikController() {

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
    private TextField inputNominal;
    @FXML
    private Label warning;


    public void toMenuPayment(ActionEvent event) throws IOException {
        application.changeScene("menuPayment.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        if (inputID.getText().isEmpty() || inputNama.getText().isEmpty() || inputNominal.getText().isEmpty()){
            warning.setText("Please input your data");
        } else if (Integer.parseInt(inputNominal.getText()) >= Data.akun.getSaldo()) {
            warning.setText("Saldo NOT enough");
        } else if (Integer.parseInt(inputNominal.getText()) % 50_000 != 0) {
            warning.setText("Nominal is NOT multiple of Rp 50.000,00");
        } else if (Integer.parseInt(inputNominal.getText()) <= 0) {
            warning.setText("Invalid Input");
        } else {
            Data.listrikID = inputID.getText();
            Data.listrikNama = inputNama.getText();
            Data.listrikNominal = Long.parseLong(inputNominal.getText());
            Data.scene = "listrik";
            application.changeScene("pin.fxml");
        }
    }

}
