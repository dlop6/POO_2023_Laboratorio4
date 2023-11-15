package com.biblioteca.controller;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.biblioteca.bean.User;


public class CSVController {
    public void exportUsuarios(ArrayList<User> usuarios) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/biblioteca/bean/db/usuarios.csv"));
            writer.write("id, name, password, isPremium\n");
            for (User usuario : usuarios) {
                writer.write(usuario.getID() + ", " + usuario.getName() + ", " + usuario.getPassword() + ", " + usuario.isPremium() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exporLoans(ArrayList<User> usuarios){


        
    }
}


