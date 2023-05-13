package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class limitController {
    public limitController(){
    }
    Main m = new Main();

    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonLanjut;

    public void toMenuAkunSayaController(ActionEvent event) throws IOException {
        m.changeScene("menuAkunSaya.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        m.changeScene("pin.fxml");
    }
}
