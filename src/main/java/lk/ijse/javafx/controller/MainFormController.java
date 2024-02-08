package lk.ijse.javafx.controller;

/*
    @author DanujaV
    @created 2/8/24 - 3:35 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane rootNode;

    public void btnCustomerOnAction(ActionEvent actionEvent) {
    }

    public void btnItemOnAction(ActionEvent actionEvent) {
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);


        stage.centerOnScreen();
        stage.setTitle("Login Form");
    }
}
