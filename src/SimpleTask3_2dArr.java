import java.util.Arrays;
import java.util.Random;

public class SimpleTask3_2dArr {
    public static void main(String[] args) {
        System.out.println("Сумма чисел двумерного массива равна: " + array2D(3));
    }

    public static int array2D(int n) {
        int[][] myArray = new int[n][n];
        // Random random = new Random();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                myArray[i][j] = (int) (10 * Math.random());
                sum += myArray[i][j];
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }


        return sum;
    }
}
