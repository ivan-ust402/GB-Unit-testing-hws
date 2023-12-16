package homework2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    @DisplayName("проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)")
    void checkCarInstanceOfVehicle() {
        Car car = new Car("Volvo", "XC90", 2016);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    @DisplayName("проверка того, объект Car создается с 4-мя колесами")
    void checkCountOfWheelsCar() {
        Car car = new Car("Volvo", "XC90", 2016);
        assertEquals(4, car.getNumWheels(), "У машины должно быть 4 колеса!");
    }

    @Test
    @DisplayName("проверка того, объект Motorcycle создается с 2-мя колесами")
    void checkCountOfWheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1M", 2024);
        assertEquals(2, motorcycle.getNumWheels(), "У мотоцикла должно быть 2 колеса!");
    }

    @Test
    @DisplayName("проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())")
    void checkCarMethodTestDrive() {
        Car car = new Car("Volvo", "XC90", 2016);
        car.testDrive();
        int testDriveSpeed = car.getSpeed();
        assertEquals(60, testDriveSpeed, "В режиме тест-драйва скорость машины должна быть 60");
    }

    @Test
    @DisplayName("проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())")
    void checkMotorcycleMethodTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1M", 2024);
        motorcycle.testDrive();
        int testDriveSpeed = motorcycle.getSpeed();
        assertEquals(75, testDriveSpeed, "В режиме тест-драйва скорость мотоцикла должна быть 75");
    }

    @Test
    @DisplayName("проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)")
    void checkCarMethodPark() {
        Car car = new Car("Volvo", "XC90", 2016);
        car.testDrive();
        car.park();
        int speed = car.getSpeed();
        assertEquals(0, speed, "В режиме парковки скорость машины должна быть 0");
    }
    @Test
    @DisplayName("проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)")
    void checkMotorcycleMethodPark() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1M", 2024);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "В режиме парковки скорость мотоцикла должна быть 0");
    }
}