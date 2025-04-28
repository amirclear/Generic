package src.products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nId: " + getId() + "\n";
    }

    protected abstract String generateId();

}
