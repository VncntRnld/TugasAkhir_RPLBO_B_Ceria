package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController {

    Main m = new Main();
    @FXML
    private Button buttonInfo;
    @FXML
    private Button buttonTransfer;
    @FXML
    private Button buttonPayment;
    @FXML
    private Button buttonAkun;

    public void toTransfer(ActionEvent event) throws IOException {
        m.changeScene("menuTransfer.fxml");
    }

    public void toAkunSaya(ActionEvent event) throws IOException {
        m.changeScene("menuAkunSaya.fxml");
    }

    public void toInfo(ActionEvent event) throws IOException {
        m.changeScene("menuInfoRekening.fxml");
    }

    public void toPayment(ActionEvent event) throws IOException {
        m.changeScene("menuPayment.fxml");
    }
}
