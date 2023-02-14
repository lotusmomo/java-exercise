//4.3

/* Hexadecimals are often used in computer systems programming. 
 * Please write a method that converts a decimal integer to a hexadecimal.
 */

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int numDec = sc.nextInt();
            // Official Implementation
            String numHex = Integer.toHexString(numDec); //有封装好的方法不用我是傻逼
            // My Implementation
            /* String numHex = "";
            while (numDec != 0) {
                int remainder = numDec % 16;
                if (remainder < 10) {
                    numHex = remainder + numHex;
                } else {
                    numHex = (char) ('A' + remainder - 10) + numHex;
                }
                numDec /= 16;
            } */
            System.out.println(numHex);
        }
    }
}