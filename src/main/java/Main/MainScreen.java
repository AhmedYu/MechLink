package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainScreen extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();


        VBox vb = new VBox(10);

        Label title = new Label("MechLInk");
title.getStyleClass().add("tittle");
        vb.getChildren().add(title);
        Button loginInBtn = new Button("Login");

        grid.setPadding(new Insets(10.2));
grid.add(loginInBtn, 0,1);


        vb.getChildren().add(grid);
        Scene sn = new Scene(vb,500, 700);


        primaryStage.setScene(sn);
        primaryStage.setTitle("Welcome page");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}