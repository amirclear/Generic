package src.inventory;

import src.products.Product;
import java.util.ArrayList;

public class Inventory<T extends Product> {

    private ArrayList<T> items = new ArrayList<>();

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount(String productName, int discount) {
        for (T item : items) {
            if (item.getTitle().equals(productName)) {
                double newPrice = item.getPrice() * (100 - discount) / 100;
                item.setPrice(newPrice);
            }
        }
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemById(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (Integer.parseInt(items.get(i).getId()) == id) {
                items.remove(i);
                System.out.println("Item with Id: " + id + " remove successfully");
                break;
            }
        }
        System.out.println("Product with this ID not found");
    }

    public T findItemsById(int id) {
        for (T product : items) {
            if (Integer.parseInt(product.getId()) == id) {
                return product;
            }
        }
        System.out.println("Product  with this ID not found");
        return null;
    }

    public void displayAll() {
        for ( T item : items) {
            System.out.println(item);
            System.out.println();
        }
    }

}
