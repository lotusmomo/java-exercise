import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calen {
    public static void main(String[] args) {
        Calendar ca = new GregorianCalendar();
        System.out.print("Current Date is");
        System.out.print(" Year: " + ca.get(GregorianCalendar.YEAR));
        System.out.print(" Month: " + (ca.get(GregorianCalendar.MONTH) + 1));
        System.out.print(" Day: " + ca.get(GregorianCalendar.DAY_OF_MONTH) + "\n");
        ca.setTimeInMillis(1234567898765L);
        System.out.print("Set Date to");
        System.out.print(" Year: " + ca.get(GregorianCalendar.YEAR));
        System.out.print(" Month: " + (ca.get(GregorianCalendar.MONTH) + 1));
        System.out.print(" Day: " + ca.get(GregorianCalendar.DAY_OF_MONTH) + "\n");
    }
}