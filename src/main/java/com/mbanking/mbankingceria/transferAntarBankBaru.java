package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.IOException;

public class transferAntarBankBaru {

    public transferAntarBankBaru(){

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;
    @FXML
    private Button buttonLanjut;

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
