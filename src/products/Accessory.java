package src.products;

import java.util.Random;

public class Accessory extends Product{

    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + "Color: " + getColor() +"\n";
    }

    @Override
    protected String generateId() {
        Random random = new Random();
        int randomNumber = 100 + random.nextInt(900);
        return 3 + Integer.toString(randomNumber);
    }


}
