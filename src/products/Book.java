package src.products;
import java.util.Random;

public class Book extends Product {

    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre){
        super(title,price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor (){
        return author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getPublication() {
        return publication;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + "Author: " + getAuthor() + "\nPublication: " + getPublication() + "\nGenre: " + getGenre();
    }

    @Override
    protected String generateId() {
        Random random = new Random();
        int randomNumber = 100 + random.nextInt(900);
        return 1 + Integer.toString(randomNumber);
    }
}
