package homework1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private Shop shop;
    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }
    @BeforeEach
    void init() {
        shop = new Shop();
    }
    @AfterEach
    void cleanup() {
        shop = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After All tests");
    }

    @Test
    @DisplayName("Проверка на правильное количество продуктов при пустой корзине")
    void getCartCount() {
        assertEquals(0, shop.getProducts().size());
    }

    @Test
    @DisplayName("Проверка на правильное количество продуктов при непустой корзине")
    void getCartCount1() {
        Product product1 = new Product("Product1", 10);
        shop.addProduct(product1);
        assertEquals(1, shop.getProducts().size());
    }

    @Test
    @DisplayName("Проверка на верное отображение корзины при наличии одного товара")
    void addAndGetProduct() {
        Product product1 = new Product("Product1", 10);
        shop.addProduct(product1);
        assertEquals(product1, shop.getProducts().get(0));
    }

    @Test
    @DisplayName("Проверка на верное отображение корзины при добавлении второго товара")
    void addAndGetProduct1() {
        Product product1 = new Product("Product1", 10);
        Product product2 = new Product("Product2", 20);
        shop.addProduct(product1);
        shop.addProduct(product2);
        assertEquals(product2, shop.getProducts().get(1));
    }

    @Test
    @DisplayName("Проверка правильности сортировки продуктов по возрастанию")
    void sortProductByPrice() {
        Product product1 = new Product("Product1", 40);
        Product product2 = new Product("Product2", 20);
        Product product3 = new Product("Product3", 5);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.sortProductByPrice();
        assertEquals(product3, shop.getProducts().get(0));
    }

    @Test
    @DisplayName("Проверка работы метода получения самого дорогого продукта")
    void getMostExpensiveProduct() {
        Product product1 = new Product("Product1", 40);
        Product product2 = new Product("Product2", 20);
        Product product3 = new Product("Product3", 5);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        Product expensiveProduct = shop.getMostExpensiveProduct();
        assertEquals(product1, expensiveProduct);
    }
}