//2.2

import java.util.Scanner;

public class ASCII2Char {
    public static void main(String args[]) {
        System.out.print("Enter an ASCII code: ");
        try(Scanner sc = new Scanner(System.in)) {
            int asciiCode  = sc.nextInt();
            char asciiChar = (char)asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is " + asciiChar);
        }
    }
}
