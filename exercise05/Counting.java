import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Counting {
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 100: ");
        int numBuffer;
        Map<Integer, Integer> numHashMap = new HashMap<Integer, Integer>(); //初始化哈希表
        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                numBuffer = sc.nextInt(); //将stdin放入buffer
                if (numBuffer == 0 ) {
                    break;
                } else {
                    Integer i = numHashMap.get(numBuffer);
                    numHashMap.put(numBuffer, (i == null) ? 1 : i + 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> val: numHashMap.entrySet()) {
            System.out.print(val.getKey() + " occurs " + val.getValue() + " time");
            if (val.getValue() > 1) {
                System.out.println("s");
            } else {
                System.out.println("");
            }
        }
    }
}