package edu.metrostate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainScreen extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        GridPane grid = new GridPane();


        Scene sn = new Scene(createVB(),500, 700);

loadStylesheetIntoScene(sn);

        primaryStage.isResizable();
        primaryStage.setScene(sn);
        primaryStage.setTitle("Welcome page");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
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
public  Parent createVB(){
    Image  logo = new Image(getClass().getResource("images/icon.png").toString());

    ImageView imageView = new ImageView();
    //Setting image to the image view
    imageView.setImage(logo);

imageView.setFitWidth(110);
imageView.setPreserveRatio(true);
    HBox hb = new HBox(0);
    hb.getChildren().add(imageView);


hb.setAlignment(Pos.CENTER);

    VBox vb = new VBox(10);
    vb.getStyleClass().add("root");
vb.setSpacing(30);




    vb.getChildren().add(hb);


vb.getChildren().add(createLablesForTheLogo());

vb.getChildren().add(createButtons());
    Insets inset = new Insets(10);
   return  vb;
}
static  VBox createLablesForTheLogo(){
    VBox logoBox = new VBox(4);
    Label brandLogo = new Label("MechLink");


    brandLogo.getStyleClass().add("brandName");
    Label slogan = new Label("MechLink: Drive. Connect.Thrive");
logoBox.setAlignment(Pos.CENTER);


    brandLogo.getStyleClass().add("brandName");

  logoBox.getChildren().add(brandLogo);
    slogan.getStyleClass().add("slogan");
 logoBox.getChildren().add(slogan);
slogan.getStyleClass().add("slogan");

return  logoBox;
}

    /**
     * This method will serve as button constructor
     * or creator. Sometime in the future we may
     * add event handlers to the
     * buttons.
     * @return vbox that holds two buttons.
     */
    public static VBox createButtons(  ){
        Button signUpBtn = new Button("Sign up");
        Button loginBtn = new Button("Log in");

        VBox box = new VBox(30, signUpBtn, loginBtn);
     signUpBtn.getStyleClass().add("mainBtns");
  loginBtn.getStyleClass().add("mainBtns");
  box.getStyleClass().add("buttonBox");


    return box;

}
}