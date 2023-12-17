package homework3.task3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    // Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
    // кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
    // указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       if (findByName(user.name)) {
           System.out.println("Такой пользователь уже существует! Нет необходимости довавлять его снова!");
       } else {
           data.add(user);
       }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public List<User> getUsersList() {
        return data;
    }

    public void logOutUsersExceptAdmins() {
        List<User> result = new ArrayList<>();
        for (User user : data) {
            if (user.isAdmin()) {
                result.add(user);
            }
        }
        data = result;
    }

}