//3.2
import java.util.Scanner;;

public class Tria {
    public static void main(String args[]) {
        System.out.print("Enter 3 edges: ");
        try(Scanner sc = new Scanner(System.in)) {
            double[] Edge = new double[3];
            for (int i = 0; i < 3; ++i) {
                Edge[i] = sc.nextDouble();
            }
            System.out.print("Can edges " + Edge[0] + ", " + Edge[1] + ", and " + Edge[2] + " from a triangle? ");
            if (Edge[0] + Edge[1] > Edge[2] && Edge[0] + Edge[2] > Edge[1] && Edge[1] + Edge[2] > Edge[0]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
