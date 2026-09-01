public class LeftRightMid {

    public static void main(String[] args) {
        String s = "abcde";

        System.out.println("Test String: " + s);
        System.out.println();

        System.out.println("*** TEST OF LEFT METHOD ***");
        for (int i = 0; i <= 6; i++) {
            System.out.printf("left(\"%s\", %d) = %s\n", s, i, left(s, i));
        }
        System.out.println();

        System.out.println("*** TEST OF RIGHT METHOD ***");
        for (int i = 0; i <= 6; i++) {
            System.out.printf("right(\"%s\", %d) = %s\n", s, i, right(s, i));
        }
        System.out.println();

        System.out.println("*** TEST OF MID1 METHOD ***");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("mid1(\"%s\", %d) = %s\n", s, i, mid1(s, i));
        }
        System.out.println();

        System.out.println("*** TEST OF MID2 METHOD ***");
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 7 - i; j++) {
                System.out.printf("mid2(\"%s\", %d, %d) = %s\n", s, i, j,
                    mid2(s, i, j));
            }
        }
        System.out.println();
    }

    public static String left(String str, int length) {
        // Your code here
        return "";
    }

    public static String right(String str, int length) {
        // Your code here
        return "";
    }

    public static String mid1(String str, int start) {
        // Your code here
        return "";
    }

    public static String mid2(String str, int start, int length) {
        // Your code here
        return "";
    }
}
