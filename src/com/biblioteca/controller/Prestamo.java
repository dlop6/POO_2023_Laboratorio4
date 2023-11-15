package com.biblioteca.controller;
import com.biblioteca.inter.LoanInterface;

public abstract class Prestamo  {

    private int plazo;
    

    public Prestamo(int plazo) {
        this.plazo = plazo;
    }


    public int getPlazo() {
        return plazo;
    }


    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    
    
}
