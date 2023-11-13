package com.biblioteca.inter;

import java.util.HashMap;
import java.util.List;

public interface ArchiveInterface {
    void export(List<HashMap<String, String>> data);

    List<HashMap<String, String>> importData();
}
