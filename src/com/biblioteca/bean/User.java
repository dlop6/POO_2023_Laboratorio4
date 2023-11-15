package com.biblioteca.bean;

import com.biblioteca.inter.MaterialMethods;


public abstract class User implements MaterialMethods {
    private String name;
    private String password;
    private String userID;
    public boolean isPremium;


    

    public User(String name, String password, String user, boolean isPremium) {
        this.name = name;
        this.password = password;
        this.userID = user;
        this.isPremium = isPremium;
    }


    public void createLoan() {
        System.out.println("Creando préstamo");
    }

    public void addResource() {
        System.out.println("Agregando recurso");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return userID;
    }

    public void setID(String ID) {
        this.userID = ID;
    }



    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }


    public void showResources() {
    }
}
