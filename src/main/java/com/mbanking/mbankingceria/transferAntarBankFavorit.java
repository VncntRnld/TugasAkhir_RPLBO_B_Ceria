package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.AkunCemberut;
import com.mbanking.mbankingceria.Model.AkunCeria;
import com.mbanking.mbankingceria.Model.AkunData;
import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class transferAntarBankFavorit implements Initializable {

    public transferAntarBankFavorit() {

    }

    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonBaru;
    @FXML
    private Button buttonLanjut;
    @FXML
    private ChoiceBox<String> inputNama;
    @FXML
    private TextField inputNoRek;
    @FXML
    private TextField inputNominal;
    @FXML
    private TextField inputBerita;
    @FXML
    private Label warning;

    // Tambahan
    private AkunData akunData = new AkunData();

    public void initialize(URL location, ResourceBundle resources) {
        inputNama.getItems().addAll(Data.akun.getFavorit());
        inputNama.setOnAction(this::getFavorit);
    }

    public void getFavorit(ActionEvent event) {
        inputNoRek.setText(Data.akun.getAkunFavorit(inputNama.getValue()));
    }

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuAntarBankBaru(ActionEvent event) throws IOException {
        application.changeScene("transferAntarBank_Baru.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        // Validasi 🔎
        if (inputNoRek.getText().isEmpty() || inputNominal.getText().isEmpty()){
            warning.setText("Please input your data");
        }
        else if (!akunData.cekTujuan(inputNoRek.getText())){
            warning.setText("Invalid NoRekening");
        }
        else if (akunData.getTujuan(inputNoRek.getText()) instanceof AkunCeria) {
            warning.setText("Invalid NoRekening");
        }
        else {
            // Selesai transfer..
            Data.scene = "transfer";
            Data.noRekTujuan = inputNoRek.getText();
            Data.tfNominal = Integer.parseInt(inputNominal.getText());
            Data.tfBerita = inputBerita.getText();

            application.changeScene("pin.fxml");
        }
    }
}
