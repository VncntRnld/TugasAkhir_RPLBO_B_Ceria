package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Akun;
import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class limitController implements Initializable {
    public limitController(){
    }
    MBankingApplication application = MBankingApplication.getInstance();
    NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonLanjut;
    @FXML
    private Label limitNow;
    @FXML
    private TextField inputLimit;
    @FXML
    private Label warning;


    public void initialize(URL location, ResourceBundle resources) {
        // Jalan kalau ganti scene
        renderInfo();
    }

    public void renderInfo(){
        long limit = Data.akun.getLimit();
        limitNow.setText("Rp " + nf.format(limit));
    }

    public void toMenuAkunSayaController(ActionEvent event) throws IOException {
        application.changeScene("menuAkunSaya.fxml");
    }

    public void toPIN(ActionEvent event) throws IOException {
        try {
            if (inputLimit.getText().isEmpty()){
                warning.setText("Please input your limit");
            } else if (Integer.parseInt(inputLimit.getText()) == Data.akun.getLimit()) {
                warning.setText("Limit can not be the same");
            } else if (Integer.parseInt(inputLimit.getText()) >= 999_000_000) {
                warning.setText("Limit exceeded.");
            } else if (Integer.parseInt(inputLimit.getText()) < 100_000) {
                warning.setText("Minimum Limit Rp 100.000");
            } else {
                Data.scene = "limit";
                Data.newLimit = Integer.parseInt(inputLimit.getText());
                application.changeScene("pin.fxml");
            }
        }
        catch (NumberFormatException e){
            warning.setText("Invalid Input");
        }

    }
}
