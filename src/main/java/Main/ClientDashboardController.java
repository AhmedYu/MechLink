package Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientDashboardController implements Initializable {
    @FXML
    private Button postJobBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data...");
    }

    @FXML
    public void postJobButtonClicked() {
        System.out.println("Clicked");
    }
}