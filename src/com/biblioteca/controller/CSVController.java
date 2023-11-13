package com.biblioteca.controller;

import com.biblioteca.inter.ArchiveInterface;
import java.util.HashMap;
import java.util.List;

public class CSVController implements ArchiveInterface {

    private final String filePath;

    public CSVController(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void export(List<HashMap<String, String>> data) {
        // Implementar lógica de exportación
        // Escribe cada HashMap del List en el archivo CSV
    }

    @Override
    public List<HashMap<String, String>> importData() {
        // Implementar lógica de importación
        // Lee el archivo CSV y llena el List con HashMaps representando cada registro
        return null; // Retorna el List lleno
    }
}
