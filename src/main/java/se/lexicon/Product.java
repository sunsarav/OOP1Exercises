package se.lexicon;

public class Product {
    private final int productId;
    private final String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }
    //Getter

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //Setter

    public void setPrice(double price) {
        if (price > 0) {
        this.price = price;
    } else {
            throw new IllegalArgumentException("Price must be positive");
        }
    }
}
