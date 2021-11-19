package com.revature.service;

import com.revature.model.Login;

import java.util.List;

public interface LoginService {

    public Login addLogin(Login a);
    public Login getLogin(int id);
    public Login updateLogin(Login change);
    public Login deleteLogin(int id);

}
