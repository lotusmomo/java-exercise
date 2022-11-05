//2.3

import java.util.Scanner;

public class DigitsSum {
    public static void main(String args[]) {
        System.out.print("Enter a number between 0 and 1000: ");
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = num/100 + (num%100)/10 + num%10;
            System.out.println("The sum of the digits is " + sum);
        }
    }
}
