public class ToCharArrayDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            System.out.print(c + " ");
        }
        // H e l l o ,   W o r l d !
    }
}
