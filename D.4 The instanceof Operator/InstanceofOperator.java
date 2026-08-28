public class InstanceofOperator {
    public static void main(String[] args) {
        Object value = "hello";
        String empty = null;

        System.out.println(value instanceof String);  // true
        System.out.println(value instanceof Integer); // false

        // null is never an instance of anything:
        System.out.println(empty instanceof String);  // false

        // Pattern form: tests and casts in one step.
        if (value instanceof String s) {
            System.out.println(s.length());           // 5
        }
    }
}
