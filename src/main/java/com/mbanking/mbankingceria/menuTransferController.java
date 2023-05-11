package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class menuTransferController {

    public menuTransferController(){

    }

    Main m = new Main();

    @FXML
    private Button buttonAntarBank;
    @FXML
    private Button buttonBack;

    public void toAntarBank(ActionEvent event) throws IOException {
        m.changeScene("transferAntarBank_Baru.fxml");

    }

    public void toMainMenu(ActionEvent event) throws IOException{
        m.changeScene("mainMenu.fxml");
    }

}
