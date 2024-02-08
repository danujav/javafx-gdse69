package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 2/8/24 - 10:58 AM   
*/

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.javafx.db.CredentialDB;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(userName.equals(CredentialDB.USER_NAME) && pw.equals(CredentialDB.PW)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Login Successful").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Login Failed").show();
        }
    }
}
