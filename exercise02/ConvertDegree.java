//2.1

import java.util.Scanner;

public class ConvertDegree {
    public static void main(String args[]) {
        System.out.print("Enter a degree in Celsius: ");
        try (Scanner sc = new Scanner(System.in)) {
            double degreeCelsius    = sc.nextDouble();
            double degreeFahrenheit = (9.0 / 5.0) * degreeCelsius + 32.0;
            System.out.println(degreeCelsius + " Celsius is " + degreeFahrenheit + " Fahrenheit");
        }
    }
}