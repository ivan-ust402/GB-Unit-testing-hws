package homework3.task3;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}