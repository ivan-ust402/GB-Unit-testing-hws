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
    void testDrive() {
    }

    @Test
    void park() {
    }
}