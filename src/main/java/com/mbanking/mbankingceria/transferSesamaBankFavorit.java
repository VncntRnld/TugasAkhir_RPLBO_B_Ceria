package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class transferSesamaBankFavorit implements Initializable {
    public transferSesamaBankFavorit(){

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

    public void initialize(URL location, ResourceBundle resources) {
        inputNama.getItems().addAll(Data.akun.getFavorit());
    }

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuSesamaBankBaru(ActionEvent event) throws IOException {
        application.changeScene("transferSesamaBank_Baru.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "transfer";
        application.changeScene("pin.fxml");
    }
}
