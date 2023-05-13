package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class internetController {

    public internetController() {

    }

    Main m = new Main();

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonLanjut;

    public void toMenuPayment(ActionEvent event) throws IOException {
        m.changeScene("menuPayment.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "internet";
        m.changeScene("pin.fxml");
    }

}
