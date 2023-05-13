package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.IOException;

public class transferSesamaBankBaru {
    public transferSesamaBankBaru(){

    }
    Main m = new Main();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;

    public void toMenuTransfer(ActionEvent event) throws IOException {
        m.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuSesamaBankFavorit(ActionEvent event) throws IOException {
        m.changeScene("transferSesamaBank_Favorit.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "transfer";
        m.changeScene("pin.fxml");
    }
}
