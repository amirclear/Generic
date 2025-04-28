package src;

import src.inventory.Inventory;
import src.products.Accessory;
import src.products.Book;
import src.products.NoteBook;
import src.products.Product;


public class Main {
    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<NoteBook> noteBookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItems(new Book("Harry Potter", 200.0, "J.K Rowling", "Publisher A", "Fiction"));
        bookInventory.addItems(new Book("Alchemist", 180.0, "Author 2", "Publisher B", "Technical"));

        noteBookInventory.addItems(new NoteBook("School Notebook", 50.0, 100, true));
        noteBookInventory.addItems(new NoteBook("English Notebook", 70.0, 200, false));

        accessoryInventory.addItems(new Accessory("Chandelier", 120.0, "Black"));
        accessoryInventory.addItems(new Accessory("Mouse", 40.0, "Blue"));

        System.out.println("Books");
        bookInventory.displayAll();

        System.out.println("Notebooks");
        noteBookInventory.displayAll();

        System.out.println("Accessories");
        accessoryInventory.displayAll();

        bookInventory.removeItemById(Integer.parseInt(bookInventory.getItems().get(0).getId()));
        System.out.println();
        noteBookInventory.removeItemById(Integer.parseInt(noteBookInventory.getItems().get(1).getId()));
        System.out.println();

        System.out.println("Books after remove");
        bookInventory.displayAll();

        System.out.println("Notebooks after remove");
        noteBookInventory.displayAll();

        double totalBooks = calculateTotalPrice(bookInventory);
        double totalNotebooks = calculateTotalPrice(noteBookInventory);
        double totalAccessories = calculateTotalPrice(accessoryInventory);

        System.out.println("Total Prices");
        System.out.println("Books Total Price: " + totalBooks);
        System.out.println("Notebooks Total Price: " + totalNotebooks);
        System.out.println("Accessories Total Price: " + totalAccessories);
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double sum = 0;
        for ( Product product : inventory.getItems()) {
            sum += product.getPrice();
        }
        return sum;
    }
}