package homework2;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeAll
    static void setup() {
        System.out.println("All tests run...");
    }

    @BeforeEach
    void init() {
        car = new Car("Volvo", "XC90", 2016);
        motorcycle = new Motorcycle("Yamaha", "YZF-R1M", 2024);
    }

    @AfterEach
    void cleanup() {
        car = null;
        motorcycle = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("All tests completed!");
    }

    @Test
    @DisplayName("проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)")
    void checkCarInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    @DisplayName("проверка того, объект Car создается с 4-мя колесами")
    void checkCountOfWheelsCar() {
        assertEquals(4, car.getNumWheels(), "У машины должно быть 4 колеса!");
    }

    @Test
    @DisplayName("проверка того, объект Motorcycle создается с 2-мя колесами")
    void checkCountOfWheelsMotorcycle() {
        assertEquals(2, motorcycle.getNumWheels(), "У мотоцикла должно быть 2 колеса!");
    }

    @Test
    @DisplayName("проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())")
    void checkCarMethodTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed(), "В режиме тест-драйва скорость машины должна быть 60");
    }

    @Test
    @DisplayName("проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())")
    void checkMotorcycleMethodTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "В режиме тест-драйва скорость мотоцикла должна быть 75");
    }

    @Test
    @DisplayName("проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)")
    void checkCarMethodPark() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "В режиме парковки скорость машины должна быть 0");
    }
    @Test
    @DisplayName("проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)")
    void checkMotorcycleMethodPark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "В режиме парковки скорость мотоцикла должна быть 0");
    }
}