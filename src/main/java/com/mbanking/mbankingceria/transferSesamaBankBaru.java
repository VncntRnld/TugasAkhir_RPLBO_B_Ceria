package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.AkunCeria;
import com.mbanking.mbankingceria.Model.AkunData;
import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class transferSesamaBankBaru {
    public transferSesamaBankBaru(){

    }
    MBankingApplication application = MBankingApplication.getInstance();

    @FXML
    private Button buttonBack;
    @FXML
    private Hyperlink buttonFavorit;
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

    // Tambahan (￣y▽￣)╭ Ohohoho.....
    AkunData akunData = new AkunData();

    public void toMenuTransfer(ActionEvent event) throws IOException {
        application.changeScene("menuTransfer.fxml");
    }

    public void toTransferMenuSesamaBankFavorit(ActionEvent event) throws IOException {
        application.changeScene("transferSesamaBank_Favorit.fxml");
    }

    public void cekSaveFavorit(ActionEvent event){
        inputNama.setDisable(!cekFavorit.isSelected());
    }

    public void toPIN(ActionEvent event) throws IOException {
        // Validasi 🔎
        if (inputNoRek.getText().isEmpty() || inputNominal.getText().isEmpty()){
            warning.setText("Please input your data");
        }
        else if (Integer.parseInt(inputNominal.getText()) >= Data.akun.getSaldo()) {
            warning.setText("Saldo NOT enough");
        }
        else if (!akunData.cekTujuan(inputNoRek.getText())){
            warning.setText("Invalid NoRekening");
        }
        else if (!(akunData.getTujuan(inputNoRek.getText()) instanceof AkunCeria)) {
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

            // Selesai
            Data.scene = "transfer";
            Data.noRekTujuan = inputNoRek.getText();
            Data.tfNominal = Integer.parseInt(inputNominal.getText());
            Data.tfBerita = inputBerita.getText();

            application.changeScene("pin.fxml");
        }
    }
}
