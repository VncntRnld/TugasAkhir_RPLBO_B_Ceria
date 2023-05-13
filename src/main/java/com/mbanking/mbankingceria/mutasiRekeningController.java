package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class mutasiRekeningController {
    public mutasiRekeningController(){

    }
    Main m = new Main();
    @FXML
    private Button buttonBack;

    public void toMenuInfoRekening(ActionEvent event) throws IOException {
        m.changeScene("menuInfoRekening.fxml");
    }
}
