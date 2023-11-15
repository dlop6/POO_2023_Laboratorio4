package com.biblioteca.bean;

public class Article {

    private String name;
    private String ISBN;

    private String type;

    private String loanedBy; // ID del usuario que lo tiene prestado

    public Article(String name, String ISBN, String type, String loanedBy) {
        this.name = name;
        this.ISBN = ISBN;
        this.type = type;
        this.loanedBy = loanedBy;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
