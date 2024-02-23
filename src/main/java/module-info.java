module com.ahmed.mechlink {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ahmed.mechlink to javafx.fxml;
    exports com.ahmed.mechlink;
}