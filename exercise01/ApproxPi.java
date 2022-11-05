//1.7

import java.lang.Math;
//(-1)^k*/(2k+1), k from 0 to 6
public class ApproxPi {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 7; i = i + 1)
        {
            sum = sum + Math.pow(-1.0,(double)i)/(2.0*(double)i+1.0);
        }
        System.out.println("Pi="+4.0*sum);
    }
}