package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class transferAntarBankFavorit {

    public transferAntarBankFavorit() {

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonBaru;
    @FXML
    private Button buttonLanjut;
    @FXML
    private ChoiceBox<String> inputNama;
    @FXML
    private TextField inputNoRek;
    @FXML
    private TextField inputNominal;
    @FXML
    private TextField inputBerita;

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuAntarBankBaru(ActionEvent event) throws IOException {
        application.changeScene("transferAntarBank_Baru.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "transfer";
        application.changeScene("pin.fxml");
    }
}
