package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MBankingApplication extends Application {

    private static Stage stg;
    private static MBankingApplication mBankingApplication;

    @Override
    public void start(Stage stage) throws IOException {
        mBankingApplication = this;
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(MBankingApplication.class.getResource("loginRegister/Login.fxml"));
        stage.setTitle("Ceria M-Banking");
        stage.setScene(new Scene(fxmlLoader.load(), 320, 560));
        stage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static MBankingApplication getInstance(){
        return mBankingApplication;
    }

    public static void main(String[] args) {
        AkunData akunData = new AkunData();

        Mutasi mutasi01 = new Mutasi("04-06-2023", "Out", 100000, 1000000);

        AkunCeria admin01 = new AkunCeria("Vincent Ronald", "71210692", "09/07/03", "Yogyakarta", "081235259418");
        admin01.setUsername("viro");
        admin01.setPassword("viro");
        admin01.setPIN("560656");

        admin01.setNoRek("00000001");
        admin01.addFavorit("deha", "00000002");
        admin01.addMutasiData(mutasi01);

        AkunCeria admin02 = new AkunCeria("Dhea Angelina", "71210693", "23/04/04", "Yogyakarta", "081235259418");
        admin02.setUsername("deha");
        admin02.setPassword("deha");
        admin02.setPIN("232323");

        admin02.setNoRek("00000002");

        AkunCemberut admin03 = new AkunCemberut("Icha Patricia", "71210784", "28/10/02", "Yogyakarta", "081235259418");
        admin03.setUsername("icha");
        admin03.setPassword("icha");
        admin03.setPIN("786786");

        admin03.setNoRek("00000003");

        akunData.addAkun(admin01);
        akunData.addAkun(admin02);
        akunData.addAkun(admin03);
        // Saya tahu ini berantakan tapi tadi saya coba masukin method dulu gabisa dipanggil ._.

        launch();
    }

}
