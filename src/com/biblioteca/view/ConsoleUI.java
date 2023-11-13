package com.biblioteca.view;

import java.util.Scanner;

public class ConsoleUI {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Biblioteca");
        System.out.println("1. Registrarse");
        System.out.println("2. Iniciar sesión");
        // Más opciones
        int opcion = scanner.nextInt();
        // Implementar lógica para manejar la opción seleccionada
    }
}
