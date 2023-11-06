package com.biblioteca.bean;

import java.util.ArrayList;

public class BaseUser extends User{


    public BaseUser(String name, String password, String ID, ArrayList<ResourcesLibrary> loan,boolean isPremium) {
        super(name, password, ID, loan, isPremium);
    }

    @Override
    public void login() {

    }

    @Override
    public void register() {

    }
}
