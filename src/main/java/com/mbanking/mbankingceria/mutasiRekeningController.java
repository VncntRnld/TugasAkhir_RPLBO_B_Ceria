package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class mutasiRekeningController {
    public mutasiRekeningController(){

    }
    MBankingApplication application = MBankingApplication.getInstance();
    @FXML
    private Button buttonBack;

    public void toMenuInfoRekening(ActionEvent event) throws IOException {
        application.changeScene("menuInfoRekening.fxml");
    }
}
