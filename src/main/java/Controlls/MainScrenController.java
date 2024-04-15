package Controlls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainScrenController {
    //SignUpController
        //ask the controller to show the view
    //singin controller
        //ask the controller to show the view
//    SingUpController singUpController ;
//    SignUpView signUpView;
    @FXML
    private Button signUpBtn;

    @FXML
    private Button loginBtn;
//   public MainScrenController(SignUpView signUpView){
////       this.signUpView  = signUpView;
//   }
    private void showSignUpView(){
//       signUpView.
    }
 public void signUpBtnHandler(){
     SingUpController singViewUpController = new SingUpController();
     singViewUpController.showLoginView();

 }
public  void loginHandler(){

    LoginViewController controller =  new  LoginViewController();
    controller.showLoginView();

}
    public MainScrenController(Button signUpBtn, Button loginBtn) {
        this.signUpBtn = signUpBtn;
        this.loginBtn = loginBtn;

    }
}