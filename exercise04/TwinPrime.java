//4.4

public class TwinPrime {
    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 3; i <= 1000; ++i) {
            if(isPrime(i) && isPrime(i+2)) {
                System.out.println("(" + i + "," + (i+2) + ")");
            }
        }
    }
}
