package com.biblioteca.controller;

import com.biblioteca.bean.Article;
import com.biblioteca.inter.LoanInterface;
import java.util.ArrayList;



public class BaseLoan  extends Prestamo implements LoanInterface{

    private String sucursal;
    private String pickUpTime;
    ArrayList<Article> loanedArticles = new ArrayList<Article>();

    public BaseLoan(int plazo, String sucursal, String pickUpTime) {
        super(plazo);
        this.sucursal = sucursal;
        this.pickUpTime = pickUpTime;
    }


 
    public void showlistResources() {
        for (Article article : loanedArticles) {
            System.out.println(article.getType());
            System.out.println("Título:" + article.getName());
            System.out.println("ISBN"+ article.getISBN());
            
        }
    }

    public void addResource(Article article) {
        loanedArticles.add(article);
    }

    public void clearResources() {
        loanedArticles.clear();
    }



    public String getSucursal() {
        return sucursal;
    }



    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }



    public String getPickUpTime() {
        return pickUpTime;
    }



    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }



    public ArrayList<Article> getLoanedArticles() {
        return loanedArticles;
    }



    public void setLoanedArticles(ArrayList<Article> loanedArticles) {
        this.loanedArticles = loanedArticles;
    }



    
}
