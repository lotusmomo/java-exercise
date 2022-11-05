//4.2

/* The Fibonacci sequence (named after the Italian mathematician Leonardo of Pisa, ca. 1200) 
 * consists of the numbers 0,1,1,2,3,5,8,13,... in which each number (except for the first two) 
 * is the sum of the two preceding numbers. Write a method fibonacci(N) that prints the first N Fibonacci numbers.
 */

import java.util.Scanner;

public class Fibonacci {
    static int Fibo(int n) {
        if (n == 0 ) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return (Fibo(n-1) + Fibo(n-2));
        }
    }
    public static void main(String args[]) {
        System.out.print("Enter N: ");
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            for (int i = 0; i <= N; ++i) {
                if (i == N) {
                    System.out.print(Fibo(i) + "\n");
                } else {
                    System.out.print(Fibo(i) + " ");
                }
            }
        }
    }
}
