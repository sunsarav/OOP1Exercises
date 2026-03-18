package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }
    //Add Product
    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }
    //Remove Product
    public void removeProduct(Product p) {
        products.remove(p);
    }
    //Calculate total price
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
