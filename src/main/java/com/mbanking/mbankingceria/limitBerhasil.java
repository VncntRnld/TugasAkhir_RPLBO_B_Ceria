package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class limitBerhasil implements Initializable {
    public limitBerhasil(){

    }
    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonMainMenu;

    public void initialize(URL location, ResourceBundle resources) {
        Data.akun.setLimit(Data.newLimit);
        Data.newLimit = 0;
    }

    public void toMainMenu(ActionEvent event) throws IOException {
        application.changeScene("mainMenu.fxml");
    }
}
