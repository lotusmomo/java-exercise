import java.util.Scanner;

class Location {
    int row;
    int column;
    double maxValue;
    void init() {
        row = 0;
        column = 0;
        maxValue = 0;
    }
}
public class Maximum {
    public static Location locateLargest(double[][] a) {
        Location Largest = new Location();
        Largest.init();
        Largest.maxValue = a[0][0];
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[0].length; ++j)
                if (a[i][j] > Largest.maxValue) {
                    Largest.row = i;
                    Largest.column = j;
                    Largest.maxValue = a[Largest.row][Largest.column];
                }
        return Largest;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row, column;
            System.out.print("Enter the number of rows and columns of the array: ");
            row = sc.nextInt();
            column = sc.nextInt();
            double[][] array = new double[row][column];
            System.out.println("Enter the array: ");
            for (int i = 0; i < row; ++i)
                for (int j = 0; j < column; ++j)
                    array[i][j] = sc.nextDouble();
            Location maxLocation = locateLargest(array);
            System.out.println("The location od the largest element is " + maxLocation.maxValue + " at (" + maxLocation.row + ", " + maxLocation.column + ")");
        }
    }
}
