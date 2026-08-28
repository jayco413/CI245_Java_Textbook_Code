public class SplitDemo {
    public static void main(String[] args) {
        String sentence = "I love programming";
        String[] words = sentence.split(" ");

        System.out.println(words.length);  // 3
        System.out.println(words[0]);      // I
        System.out.println(words[2]);      // programming
    }
}
