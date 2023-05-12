package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class menuPaymentController {
    public menuPaymentController(){
    }

    Main m = new Main();

    @FXML
    private Button buttonInternet;
    @FXML
    private Button buttonListrik;
    @FXML
    private Button buttonBack;

    public void toInternet(ActionEvent event) throws IOException {
        m.changeScene("internet.fxml");
    }

    public void toListrik(ActionEvent event) throws IOException {
        m.changeScene("listrik.fxml");
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        m.changeScene("mainMenu.fxml");
    }
}
