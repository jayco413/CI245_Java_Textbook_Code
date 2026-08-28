public class StringEqualityDemo {
    public static void main(String[] args) {
        String a = "appletree";
        String b = "appletree";       // same literal text -> same pooled object

        String c1 = "apple";
        String c2 = "tree";
        String c = c1 + c2;           // built at runtime -> a new object

        System.out.println("a == b : " + (a == b));           // true
        System.out.println("a == c : " + (a == c));           // false
        System.out.println("a.equals(b) : " + a.equals(b));   // true
        System.out.println("a.equals(c) : " + a.equals(c));   // true
    }
}
