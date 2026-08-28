public class AuthenticationManagerTest {
    public static void main(String[] args) {
        AuthenticationManager manager1 = AuthenticationManager.getInstance();
        AuthenticationManager manager2 = AuthenticationManager.getInstance();

        System.out.println("Testing Singleton Pattern. Expecting: Same instance.");
        if (manager1 == manager2) {
            System.out.println("Same instance.");
        } else {
            System.out.println("Not the same instance.");
        }

        manager1.addUser("john", "password123");
        manager1.addUser("jane", "password456");

        System.out.println("Testing correct credentials for 'john'. Expecting: true");
        System.out.println(manager1.authenticate("john", "password123"));

        System.out.println("Testing correct credentials for 'jane'. Expecting: true");
        System.out.println(manager1.authenticate("jane", "password456"));

        System.out.println("Testing incorrect password for 'john'. Expecting: false");
        System.out.println(manager1.authenticate("john", "password456"));

        System.out.println("Testing incorrect password for 'jane'. Expecting: false");
        System.out.println(manager1.authenticate("jane", "password123"));
    }
}
