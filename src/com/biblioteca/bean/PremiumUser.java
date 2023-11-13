package com.biblioteca.bean;

import java.util.ArrayList;

public class PremiumUser extends User {


    public PremiumUser(String name, String password, String user, ArrayList<ResourcesLibrary> loan, boolean isPremium) {
        super(name, password, user, loan, isPremium);

    }

    @Override
    public void login() {

    }

    @Override
    public void register() {

    }
}
