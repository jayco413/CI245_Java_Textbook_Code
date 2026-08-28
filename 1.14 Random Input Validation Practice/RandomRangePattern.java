import java.util.Random;

public class RandomRangePattern {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1, max = 10;
        int n = rand.nextInt(max - min + 1) + min;   // 1..10, inclusive
    }
}
