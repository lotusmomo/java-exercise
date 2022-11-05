//3.1

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static boolean isWin(int a, int b) {
        if (a == 0 && b== 1) {
            return false;
        } else if (a == 0 && b== 2) {
            return true;
        } else if (a == 1 && b== 0) {
            return true;
        } else if (a == 1 && b== 2) {
            return false;
        } else if (a == 2 && b== 0) {
            return false;
        } else if (a == 2 && b== 1) {
            return true;
        }
        return false;
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
            if (random == input) {
                System.out.println(" too. It is a draw.");
            } else {
                System.out.print(". ");
                if (isWin(input, random)) {
                    System.out.println("You won");
                } else {
                    System.out.println("Computer won");
                }
            }
        }
    }
}
