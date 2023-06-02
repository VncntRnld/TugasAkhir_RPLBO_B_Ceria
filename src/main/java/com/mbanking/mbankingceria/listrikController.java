package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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

    public void toMenuPayment(ActionEvent event) throws IOException {
        application.changeScene("menuPayment.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "listrik";
        application.changeScene("pin.fxml");
    }

}
