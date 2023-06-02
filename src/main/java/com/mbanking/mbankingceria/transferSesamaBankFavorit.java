package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.DataInput;
import java.io.IOException;

public class transferSesamaBankFavorit {
    public transferSesamaBankFavorit(){

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonBaru;
    @FXML
    private Button buttonLanjut;

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
