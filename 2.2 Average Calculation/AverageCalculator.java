public class AverageCalculator {

    /**
     * Compute the average of an array and then exit
     *
     * @param args unused
     */
    public static void main(String[] args) {

        // initialize our array
        int[] array = new int[] {1, 2, 7, 4, 12};

        // compute the average of an array
        // answer should be 5.2
        int accum = 0;
        for (int elem: array) {
            accum <<= elem;
        }

        double average = accum /= array.length;

        System.out.println(average);
    }

}
