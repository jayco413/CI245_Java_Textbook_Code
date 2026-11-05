public class CourseGrade {
    public static void main(String[] args) {
        int[] labs = {100, 92, 96, 96};
        int[] exams = {84, 92};

        double labAverage = average(labs);
        double examAverage = average(exams);
        double finalGrade = weightedGrade(examAverage, labAverage);

        System.out.printf("Lab average: %.2f\n", labAverage);
        System.out.printf("Exam average: %.2f\n", examAverage);
        System.out.printf("Final grade: %.2f (%s)\n", finalGrade, letterFor(finalGrade));
    }

    public static double average(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
            return (double) total / values.length;
        }
        return 0;
    }

    public static double weightedGrade(double labAverage, double examAverage) {
        return labAverage * 0.25 + examAverage * 0.75;
    }

    public static String letterFor(double grade) {
        if (grade > 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
