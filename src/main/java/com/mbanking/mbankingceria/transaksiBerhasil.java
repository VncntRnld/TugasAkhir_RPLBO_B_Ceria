package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class transaksiBerhasil {

    public transaksiBerhasil() {

    }

    Main m = new Main();

    @FXML
    private Button buttonMainMenu;

    public void toMainMenu(ActionEvent event) throws IOException {
        m.changeScene("mainMenu.fxml");
    }

}
