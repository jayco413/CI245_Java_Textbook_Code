public class GradeBook {

    private final String[] names;
    private final int[] scores;
    private int count;

    public GradeBook(int capacity) {
        names = new String[capacity];
        scores = new int[capacity];
        count = 0;
    }

    public void add(String name, int score) {
        names[count] = name;
        scores[count] = score;
        count++;
    }

    public double average() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += scores[i];
        }
        return (double) total / count;
    }

    public int scoreOf(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return scores[i];
            }
        }
        return -1;
    }

    public void report() {
        System.out.printf("Average: %.2f%n", average());
        System.out.println("Grace scored " + scoreOf("Grace"));
        System.out.println("Linus scored " + scoreOf("Linus"));
    }

    public static void main(String[] args) {
        GradeBook book = new GradeBook(5);
        book.add("Ada", 92);
        book.add("Grace", 88);
        book.add("Alan", 74);
        book.add("Edsger", 96);
        book.report();
    }
}
