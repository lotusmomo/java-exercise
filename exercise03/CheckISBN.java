//3.3

import java.util.Scanner;

public class CheckISBN {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            String stringISBN = sc.next();
            char[] charISBN   = stringISBN.toCharArray();
            int sum = 0;
            for (int i = 0; i < 9; ++i) {
                sum += (i + 1) * Character.getNumericValue(charISBN[i]);
            }
            int last = sum % 11;
            System.out.print(stringISBN);
            if (last == 10) {
                System.out.println("X");
            } else {
                System.out.println(last);
            }
        }
    }
}
