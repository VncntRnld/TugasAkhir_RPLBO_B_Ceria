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

    Main m = new Main();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonBaru;
    @FXML
    private Button buttonLanjut;

    public void toMenuTransfer(ActionEvent event) throws IOException {
        m.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuSesamaBankBaru(ActionEvent event) throws IOException {
        m.changeScene("transferSesamaBank_Baru.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "transfer";
        m.changeScene("pin.fxml");
    }
}
