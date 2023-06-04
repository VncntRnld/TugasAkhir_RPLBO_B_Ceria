package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.Data;
import com.mbanking.mbankingceria.Model.Mutasi;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class mutasiRekeningController implements Initializable {
    public mutasiRekeningController(){

    }
    MBankingApplication application = MBankingApplication.getInstance();
    @FXML
    private Button buttonBack;
    @FXML
    private TableView<Mutasi> tableMutasi;
    @FXML
    private TableColumn<Mutasi, Date> colTanggal;
    @FXML
    private TableColumn<Mutasi, String> colKeterangan;
    @FXML
    private TableColumn<Mutasi, Long> colNominal;
    @FXML
    private TableColumn<Mutasi, Long> colSaldo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colTanggal.setCellValueFactory(new PropertyValueFactory<Mutasi, Date>("Tanggal"));
        colKeterangan.setCellValueFactory(new PropertyValueFactory<Mutasi, String>("Ket"));
        colNominal.setCellValueFactory(new PropertyValueFactory<Mutasi, Long>("Nominal"));
        colSaldo.setCellValueFactory(new PropertyValueFactory<Mutasi, Long>("Saldo"));

        renderInfo();
    }

    public void renderInfo(){
        tableMutasi.setItems(Data.akun.getMutasiData());
    }

    public void toMenuInfoRekening(ActionEvent event) throws IOException {
        application.changeScene("menuInfoRekening.fxml");
    }




}
