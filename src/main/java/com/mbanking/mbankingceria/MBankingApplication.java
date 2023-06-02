package com.mbanking.mbankingceria;

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

        Akun admin01 = new Akun("Vincent Ronald", "71210692", "9703", "Yogyakarta", "081235259418");
        admin01.setUsername("viro");
        admin01.setPassword("viro");
        admin01.setPIN("560656");
        //Buat admin, 8 digit
        admin01.setNoRek("00000001");

        Akun admin02 = new Akun("Dhea Angelina", "71210693", "9704", "Yogyakarta", "081235259418");
        admin02.setUsername("deha");
        admin02.setPassword("deha");
        admin02.setPIN("232323");
        //Buat admin, 8 digit
        admin02.setNoRek("00000002");

        akunData.addAkun(admin01);
        akunData.addAkun(admin02);
        // Saya tahu ini berantakan tapi tadi saya coba masukin method dulu gabisa dipanggil ._.

        launch();
    }

}
