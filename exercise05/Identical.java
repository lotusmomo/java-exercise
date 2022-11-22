import java.util.Scanner;

public class Identical {
    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length) { //若长度不同直接返回false
            return false;
        } else {
            int t1 = 0, t2 = 0;
            for (int i = 0; i < list1.length; ++i) {
                t1 += Integer.toString(list1[i]).hashCode();
                t2 += Integer.toString(list2[i]).hashCode();
            }

            if (t1 == t2)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter list1: ");
            String str1 = sc.nextLine().toString();
            String[] arr1 = str1.split(" ");
            int[] list1 = new int[arr1.length];
            for (int i = 0; i < arr1.length; ++i) {
                list1[i] = Integer.valueOf(arr1[i]);
            }
            System.out.print("Enter list2: ");
            String str2 = sc.nextLine().toString();
            String[] arr2 = str2.split(" ");
            int[] list2 = new int[arr2.length];
            for (int i = 0; i < arr2.length; ++i) {
                list2[i] = Integer.valueOf(arr2[i]);
            }
            if (equal(list1, list2)) {
                System.out.println("Two lists are identical");
            } else {
                System.out.println("Two lists are not identical");
            }
        }
    }
}