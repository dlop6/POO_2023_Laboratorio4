package com.biblioteca.controller;

import com.biblioteca.bean.User;

import java.util.Scanner;
import java.util.ArrayList;

public class DriverUI {

    ArrayList<User> options = new ArrayList<User>();

    public void menu() {
        System.out.println("Bienvenido al sistema de la Biblioteca");
        System.out.println("1. Login");
        System.out.println("2. Registrar");
        System.out.println("3. Salir");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine(); // consume the newline character
        Login login = new Login();
        CSVController csvController = new CSVController();
        switch (option) {
            case 1:
                User user = login.login(options);

                if (user != null) {
                    if (user.isPremium()) {
                        System.out.println("1. Crear préstamo");
                        System.out.println("2. Agregar recurso");
                        System.out.println("3. Mostrar recursos");
                        System.out.println("4. Salir");
                        int option2 = sc.nextInt();
                        sc.nextLine(); // consume the newline character
                        switch (option2) {
                            case 1:
                                user.createLoan();
                                break;
                            case 2:
                                System.out.println("Ingrese el tipo de recurso (Libro/Revista)");
                                String typeResource = sc.nextLine();
                                System.out.println("Ingrese la cantidad de recursos");
                                int quantity = sc.nextInt();
                                sc.nextLine(); // consume the newline character
                                
                                break;
                            case 3:
                                user.showResources();
                                break;
                            case 4:
                                System.out.println("Gracias por usar el sistema de la Biblioteca");
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    } else {
                        System.out.println("1. Crear préstamo");
                        System.out.println("2. Mostrar recursos");
                        System.out.println("3. Salir");
                        int option2 = sc.nextInt();
                        sc.nextLine(); // consume the newline character
                        switch (option2) {
                            case 1:
                                user.createLoan();
                                break;
                            case 2:
                                user.showResources();
                                break;
                            case 3:
                                System.out.println("Gracias por usar el sistema de la Biblioteca");
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    }
                }
                break;
            case 2:
                login.register(options);
                csvController.exportUsuarios(options);
                break;
            case 3:
                System.out.println("Gracias por usar el sistema de la Biblioteca");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public void start() {
        while (true) {
            menu();
        }
    }


 
    
}
