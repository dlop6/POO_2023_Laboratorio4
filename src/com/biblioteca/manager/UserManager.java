package com.biblioteca.manager;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, String> userCredentials = new HashMap<>();

    public void addUser(String username, String password) {
        userCredentials.put(username, password);
        // Llama al método export para guardar el nuevo usuario en el archivo CSV
    }

    public boolean checkUser(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }

    public void loadUsers() {
        // Llama al método import para cargar los usuarios desde el archivo CSV
        // Rellena userCredentials con los datos
    }
}
