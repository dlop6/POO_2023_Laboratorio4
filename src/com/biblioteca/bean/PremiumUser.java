package com.biblioteca.bean;

import java.util.ArrayList;

public class PremiumUser extends User {

    public PremiumUser(String name, String password, String ID, ArrayList<ResourcesLibrary> loan) {
        super(name, password, ID, loan);
    }

    @Override
    public void login() {

    }

    @Override
    public void register() {

    }
}
