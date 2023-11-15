package com.biblioteca.controller;
import com.biblioteca.bean.Article;
import com.biblioteca.inter.LoanInterface;
import java.util.ArrayList;

public class PremiumLoan extends Prestamo implements LoanInterface {
    
        private String userID;
        private String typeResource;
        private int quantity;
        private String horarioDeEntrega;
        private String adress;

        ArrayList<Article> loanedArticles = new ArrayList<Article>();

    
        public PremiumLoan(int plazo, String userID, String typeResource, int quantity) {
            super(plazo);
            this.userID = userID;
            this.typeResource = typeResource;
            this.quantity = quantity;
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

        public void removeResource(Article article) {
            loanedArticles.remove(article);
        }

        public void clearResources() {
            loanedArticles.clear();
        }

        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getTypeResource() {
            return typeResource;
        }

        public void setTypeResource(String typeResource) {
            this.typeResource = typeResource;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getHorarioDeEntrega() {
            return horarioDeEntrega;
        }

        public void setHorarioDeEntrega(String horarioDeEntrega) {
            this.horarioDeEntrega = horarioDeEntrega;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public ArrayList<Article> getLoanedArticles() {
            return loanedArticles;
        }

        public void setLoanedArticles(ArrayList<Article> loanedArticles) {
            this.loanedArticles = loanedArticles;
        }
        
        
    
}
