module edu.metrostate {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.metrostate to javafx.fxml;
    exports edu.metrostate;
    exports Controlls;
    opens Controlls to javafx.fxml;
}