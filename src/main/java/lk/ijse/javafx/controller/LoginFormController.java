package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 2/8/24 - 10:58 AM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.javafx.db.CredentialDB;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane rootNode;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(userName.equals(CredentialDB.USER_NAME) && pw.equals(CredentialDB.PW)) {
            // navigate to the sample form
            //load scene graph to our java method
            AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

            //set a scene to the scene graph
            Scene scene = new Scene(rootNode);

            // get the primary stage from login actors
            Stage stage = (Stage) this.rootNode.getScene().getWindow();

            // set scene to the primary stage
            stage.setScene(scene);

            // set title to the stage
            stage.setTitle("Main Form");

            // get stage to the center
            stage.centerOnScreen();
        } else {
            new Alert(Alert.AlertType.ERROR, "Login Failed").show();
        }
    }
}
