//3.1

// Not over till now!
// Don't copy!

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public class Game {
        boolean getWin(int n1, int n2) {
            return false;
        }
    }
    public static void main(String args[]) {
        System.out.print("scissor (0), rock (1), paper(2): ");
        try (Scanner sc = new Scanner(System.in)) {
            Random  ra = new Random();
            int input  = sc.nextInt();
            int random = ra.nextInt(2);
            System.out.print("The computer is ");
            if (random == 0) {
                System.out.print("scissor");
            } else if (random ==  1) {
                System.out.print("rock");
            } else if (random ==  2) {
                System.out.print("paper");
            }
            System.out.print(". You are ");
            if (input == 0) {
                System.out.print("scissor");
            } else if (input ==  1) {
                System.out.print("rock");
            } else if (input ==  2) {
                System.out.print("paper");
            }
            System.out.print(" ");
            if (random == input) {
                System.out.println("too. It is a draw.");
            }
        }
    }
}
