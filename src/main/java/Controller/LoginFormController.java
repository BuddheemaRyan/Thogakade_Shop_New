package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.AmbientLight;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLogin(ActionEvent event) {
        Stage stage = new Stage();
        String username = txtUserName.getText();
        String password = txtPassword.getText();

        System.out.println("username : " + username);
        System.out.println("password : " + password);

        if ("Ryan".equals(username) && "1234".equals(password)) {
            System.out.println("Valid User");
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmed");
            alert.setHeaderText("Valid User");
            alert.setContentText("Welcome Ryan!");
            alert.showAndWait();

            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/management_form.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Dashboard");
            stage.show();
        } else {
            System.out.println("Invalid User");

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid User");
            alert.setContentText("Please enter a valid name and password");
            alert.showAndWait();

            txtUserName.setText("");
            txtPassword.setText("");
        }
    }

}
