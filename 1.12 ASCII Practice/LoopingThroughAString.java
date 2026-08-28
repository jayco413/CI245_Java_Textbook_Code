public class LoopingThroughAString {
    public static void main(String[] args) {
        String s = "Hi";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }
    }
}
