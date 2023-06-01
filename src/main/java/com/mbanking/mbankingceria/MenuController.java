package com.mbanking.mbankingceria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    Main m = new Main();
    @FXML
    private Label labelNama;
    @FXML
    private Button buttonInfo;
    @FXML
    private Button buttonTransfer;
    @FXML
    private Button buttonPayment;
    @FXML
    private Button buttonAkun;

    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        try {
            renderInfo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void renderInfo() throws IOException {
        labelNama.setText(Data.akun.getNamaNasabah());
    }

    public void toTransfer(ActionEvent event) throws IOException {
        m.changeScene("menuTransfer.fxml");
    }

    public void toAkunSaya(ActionEvent event) throws IOException {
        m.changeScene("menuAkunSaya.fxml");
    }

    public void toInfo(ActionEvent event) throws IOException {
        m.changeScene("menuInfoRekening.fxml");
    }

    public void toPayment(ActionEvent event) throws IOException {
        m.changeScene("menuPayment.fxml");
    }
}
