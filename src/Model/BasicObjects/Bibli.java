package Model.BasicObjects;

public class Bibli{
    protected String title;
    protected float price;

    public Bibli(String title, float price){
        this.title = title;
        this.price = price;
    }

    // Getters
    public String getTitle(){
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }


}