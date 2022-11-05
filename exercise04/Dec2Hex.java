//4.3

/* Hexadecimals are often used in computer systems programming. 
 * Please write a method that converts a decimal integer to a hexadecimal.
 */

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int numDec = sc.nextInt();
            String numHex = Integer.toHexString(numDec); //有封装好的方法不用我是傻逼
            System.out.println(numHex);
        }
    }
}
