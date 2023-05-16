package Assignment_JavaMethods;
// Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year
// or not.
import java.util.*;

public class Q4 {
    static boolean isLeap(int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check : ");
        int year = sc.nextInt();
        System.out.println(isLeap(year));
        sc.close();
    }
}
