package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class menuInfoController {
    public menuInfoController(){

    }

    Main m = new Main();

    @FXML
    private Button buttonSaldo;
    @FXML
    private Button buttonMutasi;
    @FXML
    private Button buttonBack;

    public void toInfoSaldo(ActionEvent event) throws IOException {
        m.changeScene("infoSaldo.fxml");
    }

    public void toMutasiRekening(ActionEvent event) throws IOException {
        m.changeScene("mutasiRekening.fxml");
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        m.changeScene("mainMenu.fxml");
    }
}
