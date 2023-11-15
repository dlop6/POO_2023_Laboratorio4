package com.biblioteca.bean;

import java.util.Scanner;   

import com.biblioteca.inter.MaterialMethods;
import com.biblioteca.controller.BaseLoan;

public class BaseUser extends User implements MaterialMethods {
    private BaseLoan loan;

    public BaseUser(String name, String password, String ID) {
        super(name, password, ID,  false);
    }


    public void createLoan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración del préstamo (en días):");
        int duration = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.println("Ingrese la sucursal:");
        String sucursal = scanner.nextLine();
        System.out.println("Ingrese  en cuanto tiempo  recogerá el artículo (12 o 24 horas):");
        String horarioDeEntrega = scanner.nextLine();
        loan = new BaseLoan(duration, sucursal, horarioDeEntrega);
    }

    @Override
    public void addResource(String typeResource, int quantity, String userID) {
        Scanner scanner = new Scanner(System.in);
        switch (typeResource) {
            case "Revista":
                for (int i = 0; i < quantity; i++) {
                    System.out.println("Ingrese el nombre de la revista");
                    String name = scanner.nextLine();
                    System.out.println("Ingrese el ISBN de la revista");
                    String ISBN = scanner.nextLine();
                    Article newArticle = new Article(name, ISBN, "Revista", userID);
                    loan.addResource(newArticle);
                }
                System.out.println(quantity + " Revista(s) agregada(s)");
                break;
            case "Libro":
                if (quantity <= 3 ) {
                    for (int i = 0; i < quantity; i++) {
                        System.out.println("Ingrese el nombre del libro");
                        String name = scanner.nextLine();
                        System.out.println("Ingrese el ISBN del libro");
                        String ISBN = scanner.nextLine();
                        Article newBook = new Article(name, ISBN, "Libro", userID);
                        loan.addResource(newBook);
                    }
                    System.out.println(quantity + " Libro(s) agregado(s)");
                } else {
                    System.out.println("No se pueden agregar más libros, porque tu cuenta solo permite 3 libros prestados");
                }
                break;
            default:
                System.out.println("Tipo de recurso no válido");
                break;
        }
    }

    @Override
    public void clearResource() {
        loan.clearResources();
        System.out.println("Préstamos eliminados");
    }
   
}
