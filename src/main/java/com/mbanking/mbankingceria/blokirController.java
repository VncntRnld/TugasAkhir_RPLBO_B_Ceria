package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class blokirController {
    public blokirController(){
    }
    Main m = new Main();

    @FXML
    private Button buttonBack;

    public void toMenuAkunSayaController(ActionEvent event) throws IOException{
        m.changeScene("menuAkunSaya.fxml");
    }

}
