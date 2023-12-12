package homework1;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }
    @BeforeEach
    void init() {
        calculator = new Calculator();
    }
    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After All tests");
    }


    @Test
    @DisplayName("Проврека корректного расчета скидки")
    void calculateDiscount1() {
        double result = calculator.calculateDiscount(10000.0, 20.0);
        assertThat(result).isEqualTo(8000);
    }

    @Test
    @DisplayName("Проврека расчета скидки для суммы покупки равной 0")
    void calculateDiscount2() {
        double result = calculator.calculateDiscount(0.0, 10.0);
        assertThat(result).isEqualTo(0.0);
    }

    @Test
    @DisplayName("Проврека срабатывания исключения при отрицательной сумме")
    void calculateDiscount3() {
        assertThatThrownBy(() -> calculator.calculateDiscount(-1000.0, 10.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    @DisplayName("Проврека срабатывания исключения при отрицательной скидке")
    void calculateDiscount4() {
        assertThatThrownBy(() -> calculator.calculateDiscount(1000.0, -10.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    @DisplayName("Проврека срабатывания исключения при скидке превышающей 100%")
    void calculateDiscount5() {
        assertThatThrownBy(() -> calculator.calculateDiscount(1000.0, 200.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}