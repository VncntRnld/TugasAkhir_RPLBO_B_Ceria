package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class menuAkunSayaController {
    public menuAkunSayaController(){

    }

    Main m = new Main();

    @FXML
    private Button buttonLimit;
    @FXML
    private Button buttonBlokir;
    @FXML
    private Button buttonBack;

    public void toAturLimit(ActionEvent event) throws IOException {
        m.changeScene("aturLimit.fxml");
    }

    public void toBlokirAkun(ActionEvent event) throws IOException {
        m.changeScene("blokirAkun.fxml");
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        m.changeScene("mainMenu.fxml");
    }

}
