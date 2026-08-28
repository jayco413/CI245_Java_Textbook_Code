import java.util.Arrays;

public class MatrixTransforms {

    public static void main(String[] args) {

        int[][] matrix =
        { {  1,  2,  3,  4,  5,  6 },
          {  7,  8,  9, 10, 11, 12 },
          { 13, 14, 15, 16, 17, 18 },
          { 19, 20, 21, 22, 23, 24 },
          { 25, 26, 27, 28, 29, 30 },
          { 31, 32, 33, 34, 35, 36 } };

        System.out.println("Matrix");
        printMatrix(matrix);
        System.out.println();

        System.out.println("Horizontal Flip");
        int[][] hfMatrix = copy2Darray(matrix);
        // ADD HORIZONTAL FLIP CODE HERE
        printMatrix(hfMatrix);
        System.out.println();

        System.out.println("Vertical Flip");
        int[][] vfMatrix = copy2Darray(matrix);
        // ADD VERTICAL FLIP CODE HERE
        printMatrix(vfMatrix);
        System.out.println();

        System.out.println("Diagonal Flip");
        int[][] dfMatrix = copy2Darray(matrix);
        // ADD DIAGONAL FLIP CODE HERE
        printMatrix(dfMatrix);
        System.out.println();

        System.out.println("Anti-Diagonal Flip");
        int[][] adfMatrix = copy2Darray(matrix);
        // ADD ANTI-DIAGONAL FLIP CODE HERE
        printMatrix(adfMatrix);
        System.out.println();
    }

    private static int[][] copy2Darray(int[][] matrix) {
        int[][] copiedMatrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            int[] aMatrix = matrix[i];
            int aLength = aMatrix.length;
            copiedMatrix[i] = new int[aLength];
            System.arraycopy(aMatrix, 0, copiedMatrix[i], 0, aLength);
        }
        return copiedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
