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

public class transferAntarBankBaru implements Initializable {

    public transferAntarBankBaru() {

    }
    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;
    @FXML
    private Button buttonLanjut;
    @FXML
    private ChoiceBox<String> inputBank;
    @FXML
    private TextField inputNama;
    @FXML
    private TextField inputNoRek;
    @FXML
    private CheckBox cekFavorit;
    @FXML
    private TextField inputNominal;
    @FXML
    private TextField inputBerita;
    @FXML
    private Label warning;

    //TAMPUNGAN
    private String[] arrBankTujuan = {"Cemberut Bank"};

    //TAMBAHAN
    private AkunData akunData = new AkunData();

    public void initialize(URL location, ResourceBundle resources) {
        inputBank.getItems().addAll(arrBankTujuan);
    }

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuAntarBankFavorit(ActionEvent event) throws IOException {
        application.changeScene("transferAntarBank_Favorit.fxml");
    }

    public void cekSaveFavorit(ActionEvent event){
        inputNama.setDisable(!cekFavorit.isSelected());
    }

    public void toPIN(ActionEvent event) throws IOException {
        // Validasi 🔎
        if (inputNoRek.getText().isEmpty() || inputNominal.getText().isEmpty()){
            warning.setText("Please input your data");
        }
        else if (!akunData.cekTujuan(inputNoRek.getText())){
            warning.setText("Invalid NoRekening");
        }
        else if (Integer.parseInt(inputNominal.getText()) >= Data.akun.getSaldo()) {
            warning.setText("Saldo NOT enough");
        }
        // Tergantung choicebox 😒
        else if (akunData.getTujuan(inputNoRek.getText()) instanceof AkunCeria) {
            warning.setText("Invalid NoRekening");
        }
        else {
            // if cekFavorit == true, save duluuu...
            if (cekFavorit.isSelected() & !inputNama.getText().isEmpty()){
                Data.akun.addFavorit(inputNama.getText(), inputNoRek.getText());
            }
            else {
                warning.setText("Invalid Favorite Name");
            }

            // Selesai transfer..
            Data.scene = "transfer";
            Data.noRekTujuan = inputNoRek.getText();
            Data.tfNominal = Integer.parseInt(inputNominal.getText());
            Data.tfBerita = inputBerita.getText();

            application.changeScene("pin.fxml");
        }
    }

}
