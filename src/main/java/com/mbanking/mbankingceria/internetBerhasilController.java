package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class internetBerhasilController {
    public internetBerhasilController(){

    }

    MBankingApplication application = MBankingApplication.getInstance();
    @FXML
    private Button buttonMainMenu;

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }
}
