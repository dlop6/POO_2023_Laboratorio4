package com.biblioteca.bean;

import java.util.ArrayList;

public abstract class User {
    private String name;
    private String password;
    private String user;

    private boolean isPremium;

    ArrayList<ResourcesLibrary> loan = new ArrayList<ResourcesLibrary>();

    public User(String name, String password, String user, ArrayList<ResourcesLibrary> loan, boolean isPremium) {
        this.name = name;
        this.password = password;
        this.user = user;
        this.loan = loan;
        this.isPremium = isPremium;
    }

    public void login() {
    }

    public void register() {
    }

    public void changePassword() {
    }

}
