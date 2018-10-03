import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j = 0;

        System.out.print("Enter rows: ");
        i = scanner.nextInt();

        System.out.print("Enter columns: ");
        j = scanner.nextInt();
        double[][] array = new double[i][j];

        System.out.println("Enter Elements of the Array: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("a[" + row + "][" + column + "] = ");
                array[row][column] = scanner.nextDouble();
            }
        }
        double max = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y] > max) {
                    max = array[x][y];
                }
            }
        }
        System.out.println(max + " is the max value of the array!");
    }
}
