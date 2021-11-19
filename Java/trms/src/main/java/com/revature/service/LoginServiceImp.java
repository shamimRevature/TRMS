package com.revature.service;

import com.revature.model.Login;
import com.revature.repositories.EventsRepo;
import com.revature.repositories.LoginRepo;

import java.util.List;

public class LoginServiceImp implements LoginService{

    LoginRepo lr;

    public LoginServiceImp(LoginRepo lr) {
        this.lr = lr;
    }

    @Override
    public Login addLogin(Login a) {

        return lr.addLogin(a);
    }

    @Override
    public Login getLogin(int id) {

        return lr.getLogin(id);
    }

    @Override
    public Login updateLogin(Login change) {

        return lr.updateLogin(change);
    }

    @Override
    public Login deleteLogin(int id) {

        return lr.deleteLogin(id);
    }
}
