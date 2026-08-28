import java.util.HashMap;

public class AuthenticationManager {

    private HashMap<String, String> users = new HashMap<>();
    private static AuthenticationManager instance;

    private AuthenticationManager() {
    }

    public static AuthenticationManager getInstance() {
        if (instance == null) {
            instance = new AuthenticationManager();
        }
        return instance;
    }

    public void addUser(String username, String password) {
        // ADD YOUR CODE HERE
    }

    public boolean authenticate(String username, String password) {
        // ADD YOUR CODE HERE
        return false;
    }
}
