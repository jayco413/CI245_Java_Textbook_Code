public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Name:\tJava");        // tab between the two words
        System.out.println("Line one\nLine two"); // splits across two lines
        System.out.println("She said \"hi\".");   // She said "hi".
        System.out.println("C:\\Users\\Public");  // C:\Users\Public
        System.out.println('\'');                 // '
        System.out.println("\u00e9");             // e with an acute accent
        System.out.println("\101\102\103");       // ABC (octal 101 is 65)
    }
}
