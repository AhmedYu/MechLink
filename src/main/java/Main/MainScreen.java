package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class MainScreen extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();


        VBox vb = new VBox(10);

        Label title = new Label("MechLInk");
title.getStyleClass().add("tittle");

        Button loginInBtn = new Button("Login");
        Button sigUpBtn = new Button("Sign up");

        grid.setPadding(new Insets(10.2));
grid.add(loginInBtn, 2,1);
grid.add(title, 0,0)
;grid.add(sigUpBtn, 2,2);
        vb.getChildren().add(grid);
        grid.setVgap(20);
        Insets inset = new Insets(23);
        grid.setPadding(inset);
        Scene sn = new Scene(vb,500, 700);

loadStylesheetIntoScene(sn);
        primaryStage.setScene(sn);
        primaryStage.setTitle("Welcome page");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch();
    }
    private void loadStylesheetIntoScene(Scene scene) {
        URL stylesheetURL = getClass().getResource("/mainStyle.css");
        if (stylesheetURL == null) {
            System.out.println("the style sheet was null!!!!");
            return;
        }
        String urlString = stylesheetURL.toExternalForm();
        if (urlString == null) {
            return;
        }
        scene.getStylesheets().add(urlString);
    }

}