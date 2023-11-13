package com.biblioteca.bean;

import java.util.ArrayList;

public class BaseUser extends User {

    public BaseUser(String name, String password, String ID, ArrayList<ResourcesLibrary> loan) {
        super(name, password, ID, loan, false);
    }
}
