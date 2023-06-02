package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class menuTransferController {

    public menuTransferController(){

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonAntarBank;

    @FXML
    private Button buttonSesamaBank;

    @FXML
    private Button buttonBack;

    public void toAntarBank(ActionEvent event) throws IOException {
        application.changeScene("transferAntarBank_Baru.fxml");

    }
    public void toSesamaBank(ActionEvent event) throws IOException {
        application.changeScene("transferSesamaBank_Baru.fxml");
    }

    public void toMainMenu(ActionEvent event) throws IOException{
        application.changeScene("mainMenu.fxml");
    }

}
