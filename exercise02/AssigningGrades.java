//2.4
import java.util.Scanner;

public class AssigningGrades {
    public static void main(String args[]) {
        System.out.print("Enter the number of students: ");
        try (Scanner sc = new Scanner((System.in))) {
            int N = sc.nextInt();
            int[] Score = new int[N];
            int bestScore = 0;
            System.out.print("Enter " + N + " scores: ");
            for (int i = 0; i < N; ++i) {
                Score[i] = sc.nextInt();
                if (Score[i] > bestScore) {
                    bestScore = Score[i];
                }
            }
            for (int i = 0; i < N; ++i) {
                System.out.print("Student " + i + " score is " + Score[i] + " and grade is ");
                if (Score[i] >= (bestScore - 10)) {
                    System.out.println("A");
                } else if (Score[i] >= (bestScore - 20)) {
                    System.out.println("B");
                } else if (Score[i] >= (bestScore - 30)) {
                    System.out.println("C");
                } else if (Score[i] >= (bestScore - 40)) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
            }
        }
    }
}
