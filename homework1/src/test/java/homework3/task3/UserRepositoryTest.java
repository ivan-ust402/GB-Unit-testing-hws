package homework3.task3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    @BeforeAll
    static void setup() {
        System.out.println("All test start...");
    }

    @AfterAll
    static void teardown() {
        System.out.println("All tests completed!");
    }

    @Test
    void logOutUsersExceptAdmins() {
        UserRepository userRepository = new UserRepository();

        User user1 = new User("Ted", "123456", false);
        User user2 = new User("Ben", "234567", false);
        User user3 = new User("Bob", "567890", false);
        User user4 = new User("Carlo", "carloBoss", true);
        User user5 = new User("Marge", "12356", false);
        User user6 = new User("Meggi", "3456", false);

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(user4);
        userRepository.addUser(user5);
        userRepository.addUser(user6);

        userRepository.logOutUsersExceptAdmins();
        List<User> adminList = userRepository.getUsersList();
        assertThat(adminList.size()).isEqualTo(1);
        assertTrue(adminList.contains(user4));
        assertTrue(userRepository.findByName("Carlo"));
        assertFalse(userRepository.findByName("Ted"));
    }
}