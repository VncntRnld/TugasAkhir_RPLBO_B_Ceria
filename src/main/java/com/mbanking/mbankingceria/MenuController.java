package com.mbanking.mbankingceria;

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

    public void toTransfer() throws IOException {
        m.changeScene("menuTransfer.fxml");
    }

}
