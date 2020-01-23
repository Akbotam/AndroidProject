package com.example.midtermproject.Presenter;

import com.example.midtermproject.Model.User;
import com.example.midtermproject.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
        int loginCode = user.isValidData();

        if(loginCode == 0)
            loginView.onLoginError("You must enter your email");
        else if(loginCode == 1)
            loginView.onLoginError("You must enter valid email");
        if(loginCode == 2)
            loginView.onLoginError("Password length should be morethan 6");
        else
            loginView.onLoginSuccess("Login Success");
    }


}
