package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class menuInfoController {
    public menuInfoController(){

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonSaldo;
    @FXML
    private Button buttonMutasi;
    @FXML
    private Button buttonBack;

    public void toInfoSaldo(ActionEvent event) throws IOException {
        application.changeScene("infoSaldo.fxml");
    }

    public void toMutasiRekening(ActionEvent event) throws IOException {
        application.changeScene("mutasiRekening.fxml");
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }
}
