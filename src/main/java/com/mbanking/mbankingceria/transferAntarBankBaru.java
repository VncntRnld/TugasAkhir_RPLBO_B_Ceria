package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.IOException;

public class transferAntarBankBaru {

    public transferAntarBankBaru(){

    }

    Main m = new Main();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;

    public void toMenuTransfer(ActionEvent event) throws IOException {
        m.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuAntarBankFavorit(ActionEvent event) throws IOException {
        m.changeScene("transferAntarBank_Favorit.fxml");
    }

}
