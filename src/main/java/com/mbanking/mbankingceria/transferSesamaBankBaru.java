package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

import java.io.IOException;

public class transferSesamaBankBaru {
    public transferSesamaBankBaru(){

    }
    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;
    @FXML
    private TextField inputNama;
    @FXML
    private TextField inputNoRek;
    @FXML
    private TextField inputNominal;
    @FXML
    private TextField inputBerita;

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuSesamaBankFavorit(ActionEvent event) throws IOException {
        application.changeScene("transferSesamaBank_Favorit.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "transfer";
        application.changeScene("pin.fxml");
    }
}
