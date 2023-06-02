package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class blokirController {
    public blokirController(){
    }
    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonLanjut;

    public void toMenuAkunSayaController(ActionEvent event) throws IOException{
        application.changeScene("menuAkunSaya.fxml");
    }
    public void toPIN(ActionEvent event) throws IOException {
        Data.scene = "blokir";
        application.changeScene("pin.fxml");
    }

}
