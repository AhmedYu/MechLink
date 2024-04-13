package Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class JobPostingController {

    @FXML
    public TextField firstNameField;
    public TextField lastNameField;
    public DatePicker datePicked;
    public TextField locationField;
    public TextField carModelField;
    public TextField jobDescriptionField;

    @FXML
    public Button submitBtn;
    public Button cancelBtn;
}
