package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class transferAntarBankBaru implements Initializable {

    public transferAntarBankBaru() {

    }
    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;
    @FXML
    private Button buttonLanjut;
    @FXML
    private ChoiceBox<String> inputBank;
    @FXML
    private TextField inputNama;
    @FXML
    private TextField inputNoRek;
    @FXML
    private CheckBox cekFavorit;
    @FXML
    private TextField inputNominal;
    @FXML
    private TextField inputBerita;

    //TAMPUNGAN
    private String[] arrBankTujuan = {"Cemberut Bank"};

    public void initialize(URL location, ResourceBundle resources) {
        inputBank.getItems().addAll(arrBankTujuan);
    }

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuAntarBankFavorit(ActionEvent event) throws IOException {
        application.changeScene("transferAntarBank_Favorit.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "transfer";
        application.changeScene("pin.fxml");
    }

}
