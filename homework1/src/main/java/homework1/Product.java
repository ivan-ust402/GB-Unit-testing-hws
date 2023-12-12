package homework1;

public class Product {
    private final String productName;
    private final int productPrice;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getName() {
        return productName;
    }

    public int getPrice() {
        return productPrice;
    }
}
