package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 2/8/24 - 10:58 AM   
*/

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        System.out.println(userName);
        System.out.println(pw);
    }
}
