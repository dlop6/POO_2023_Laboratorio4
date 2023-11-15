package com.biblioteca.controller;

import com.biblioteca.bean.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);


    public Login() {
    }

    public User login(ArrayList<User> users) {
        System.out.println("Ingrese su usuario");
        String username = scanner.nextLine();
        System.out.println("Ingrese su contraseña");
        String password = scanner.nextLine();
        for (User user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Bienvenido " + user.getName());
                return user;
            }
        }
        System.out.println("Usuario o contraseña incorrectos");
        return null;

    }

    public void register(ArrayList<User> users) {
        
        System.out.println("Ingrese su usuario");
        String username = scanner.nextLine();
        System.out.println("Ingrese su contraseña");
        String password = scanner.nextLine();
        System.out.println("Ingrese su ID");
        String ID = scanner.nextLine();
        System.out.println("Ingrese el tipo de usuario (base/premium)");
        String userType = scanner.nextLine();
        User newUser;
        if (userType.equalsIgnoreCase("premium")) {
            newUser = new PremiumUser(username, password, ID);
        } else {
            newUser = new BaseUser(username, password, ID);
        }
        users.add(newUser);
        System.out.println("Usuario registrado");
    }

    public void changePassword() {
        System.out.println("Ingrese su usuario");
        String username = scanner.nextLine();
        System.out.println("Ingrese su contraseña actual");
        String password = scanner.nextLine();
        System.out.println("Ingrese su nueva contraseña");
        String newPassword = scanner.nextLine();
        System.out.println("Ingrese su ID");
        String ID = scanner.nextLine();
        System.out.println("Ingrese el tipo de usuario (base/premium)");
        String userType = scanner.nextLine();
        User newUser;
        if (userType.equalsIgnoreCase("premium")) {
            newUser = new PremiumUser(username, password, ID);
        } else {
            newUser = new BaseUser(username, password, ID);
        }
        System.out.println("Contraseña cambiada");


    }
    
}
