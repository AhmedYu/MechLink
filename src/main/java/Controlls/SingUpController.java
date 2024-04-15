package Controlls;

import View.SignUpView;

public class SingUpController {
    public void showLoginView(){
  SignUpView signUpView =  SignUpView.getInstance();

        signUpView.getStage().show();



    }
}
