package homework3.task1;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @BeforeAll
    static void setup() {
        System.out.println("All test start...");
    }

    @AfterAll
    static void teardown() {
        System.out.println("All tests completed!");
    }

//    Линейный вариант
//    @Test
//    @DisplayName("Проверка при условии получении на вход функции четных чисел")
//    void evenNumber1() {
//        Task1 task1 = new Task1();
//        assertTrue(task1.evenOddNumber(0));
//        assertTrue(task1.evenOddNumber(2));
//        assertTrue(task1.evenOddNumber(4));
//        assertTrue(task1.evenOddNumber(6));
//        assertTrue(task1.evenOddNumber(8));
//        assertTrue(task1.evenOddNumber(10));
//        assertTrue(task1.evenOddNumber(12));
//
//    }

    @ParameterizedTest
    @ValueSource(ints = {0, 24, 26, 28, 30, 32, 34, 36, 38})
    @DisplayName("Проверка при условии получении на вход функции четных чисел")
    void evenNumber2(int even) {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(even),
                "Число должно определяться как четное! \n" +
                        "Необходимо проверить входящие числа либо сам метод!");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 13, 15})
    @DisplayName("Проверка при условии получении на вход функции нечетных чисел")
    void oddNumber(int even) {
        Task1 task1 = new Task1();
        assertFalse(task1.evenOddNumber(even),
                "Число должно определяться как нечетное! \n" +
                        "Необходимо проверить входящие числа либо сам метод!");
    }

}