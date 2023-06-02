package com.mbanking.mbankingceria;

import com.mbanking.mbankingceria.Model.AkunCeria;
import com.mbanking.mbankingceria.Model.AkunData;
import com.mbanking.mbankingceria.Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {

    public LoginController() {

    }

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label loginMsg;
    @FXML
    private Button signIn;
    @FXML
    private Hyperlink toRegister;
    MBankingApplication application = MBankingApplication.getInstance();

    private AkunData akunData = new AkunData();

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogIn();
    }

    private void checkLogIn() throws IOException {
        //Verify if account is stored in AkunData
        if (akunData.verifyAkun(username.getText(), password.getText())){
            Data.akun = (AkunCeria) akunData.getAkun(username.getText());
            application.changeScene("mainMenu.fxml");
        }
        else if (username.getText().isEmpty() || password.getText().isEmpty()){
            loginMsg.setText("Please enter your data");
        }
        else {
            loginMsg.setText("Username or Password Invalid");
        }

    }

    public void moveRegister(ActionEvent event) throws IOException{
        application.changeScene("Register.fxml");
    }

}
