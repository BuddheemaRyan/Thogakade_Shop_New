package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementFormController {
    Stage stage = new Stage();

    @FXML
    void btnCustomerManagement(ActionEvent event) throws IOException {
        stage.close();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customer_form.fxml"))));
        stage.show();
    }

    @FXML
    void btnItemManagement(ActionEvent event) throws IOException {
        stage.close();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/item_form.fxml"))));
        stage.show();
    }

    @FXML
    void btnLogOut(ActionEvent event) throws IOException {
        stage.close();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
        stage.show();
    }

    @FXML
    void btnOrderDetailsManagement(ActionEvent event) throws IOException {
        stage.close();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/orderdetails_form.fxml"))));
        stage.show();
    }

    @FXML
    void btnOrdersManagement(ActionEvent event) throws IOException {
        stage.close();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/order_form.fxml"))));
        stage.show();
    }

}
