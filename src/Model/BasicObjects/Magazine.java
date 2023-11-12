package Model.BasicObjects;

public class Magazine extends Bibli{

    private String edition;
    private String author;

    public Magazine(String title, String edition, String author, float price){
        super(title, price);
        this.edition = edition;
        this.author = author;
    }

    // Getters
    public String getEdition(){
    return this.edition;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "edition='" + edition + '\'' +
                ", author='" + author + '\'' + 
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}