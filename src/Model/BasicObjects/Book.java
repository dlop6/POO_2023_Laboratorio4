package Model.BasicObjects;


public class Book extends Bibli{
    
        private String Editora;
        private String author;
    
        public Book(String title, String edition, String author, float price){
            super(title, price);
            this.Editora = edition;
            this.author = author;
        }
    
        // Getters
        public String getEdition(){
        return this.Editora;
        }
    
        public String getAuthor(){
            return this.author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "Editora='" + Editora + '\'' +
                    ", author='" + author + '\'' + 
                    ", title='" + title + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
}