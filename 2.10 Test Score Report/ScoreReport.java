public class ScoreReport {
    public static void main(String[] args) {
        int[] scores = {78, 92, 85, 64, 99, 71, 88, 95, 57, 83, 90, 76};

        int highest = scores[0];
        int lowest = 0;
        int total = 0;
        double average = 0;
        int aboveAverage = 0;

        for (int i = 0; i <= scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            total += scores[i];
            if (scores[i] > average) {
                aboveAverage++;
            }
        }
        average = total / scores.length;

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Above average: " + aboveAverage);
    }
}
