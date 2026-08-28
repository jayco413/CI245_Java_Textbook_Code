public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] array1 = new int[10][10];       // all elements 0
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array3 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Printing elements of array2:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
