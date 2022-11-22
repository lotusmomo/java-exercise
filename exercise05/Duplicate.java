import java.util.Scanner;
import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;

public class Duplicate {
    public static int[] eliminateDuplicates(int[] numbers) {
        /*
        //复杂写法 同时拆箱装箱带来性能损耗
        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList()); //array转list
        int[] target = numbersList.stream().distinct().mapToInt(i -> i).toArray(); //list转为stream后去重再写入target
        */
        //更简单的写法
        int[] target = Arrays.stream(numbers).distinct().toArray(); //Java1.8引入distinct
        return target;
    }
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = sc.nextInt();
            }
        }
        int[] target = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int element: target) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}