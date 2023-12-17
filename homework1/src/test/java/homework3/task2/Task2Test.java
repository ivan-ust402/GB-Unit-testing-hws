package homework3.task2;

import homework3.task1.Task1;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @BeforeAll
    static void setup() {
        System.out.println("All test start...");
    }

    @AfterAll
    static void teardown() {
        System.out.println("All tests completed!");
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 30, 65, 99})
    @DisplayName("Проверка при условии получении на вход функции чисел входящих в диапазон")
    void numberInInterval(int even) {
        Task2 task2 = new Task2();
        assertTrue(task2.numberInInterval(even),
                "Число должно быть в интервале (25, 100)! \n" +
                        "Необходимо проверить входящие числа либо сам метод!");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 10, 25, 100, 150})
    @DisplayName("Проверка при условии получении на вход функции чисел вне диапазона")
    void numberOutInterval(int even) {
        Task2 task2 = new Task2();
        assertFalse(task2.numberInInterval(even),
                "Число должно быть вне интервала (25, 100)! \n" +
                        "Необходимо проверить входящие числа либо сам метод!");
    }

}