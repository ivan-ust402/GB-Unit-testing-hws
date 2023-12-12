package homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private final List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void sortProductByPrice() {
        Collections.sort(products, (a, b) -> a.getPrice() - b.getPrice());
    }

    public Product getMostExpensiveProduct() {
        Product expensiveProduct = null;
        for (Product product : products) {
            if (expensiveProduct == null || product.getPrice() > expensiveProduct.getPrice()) {
                expensiveProduct = product;
            }
        }
        return  expensiveProduct;
    }
}


