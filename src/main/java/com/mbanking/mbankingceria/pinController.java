package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class pinController {
    public pinController(){

    }
    Main m = new Main();
    @FXML
    private Button buttonBack;
    @FXML
    private PasswordField PIN;
    @FXML
    private Button buttonKonfirmasi;

    public void toMainMenu(ActionEvent event) throws IOException {
        m.changeScene("mainMenu.fxml");
    }

    public void konfirmasiPIN(ActionEvent event) throws IOException {
        System.out.println(Data.scene);
        toBerhasil();
    }

    private void toBerhasil() throws IOException {
        if (Data.scene.equals("transfer")) {
            m.changeScene("transferBerhasil.fxml");
        }
        else if (Data.scene.equals("listrik")) {
            m.changeScene("ListrikBerhasil.fxml");
        }
        else if (Data.scene.equals("internet")) {
            m.changeScene("InternetBerhasil.fxml");
        }
        else if (Data.scene.equals("blokir")) {
            m.changeScene("blokirBerhasil.fxml");
        }
        else if (Data.scene.equals("limit")) {
            m.changeScene("limitBerhasil.fxml");
        }
    }

}
