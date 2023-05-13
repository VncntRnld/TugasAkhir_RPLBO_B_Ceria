package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;

import java.io.IOException;

public class infoSaldoController {
    public infoSaldoController(){

    }
    Main m = new Main();

    @FXML
    private Button buttonBack;

    public void toMenuInfoRekening(ActionEvent event) throws IOException{
        m.changeScene("menuInfoRekening.fxml");
    }
}
