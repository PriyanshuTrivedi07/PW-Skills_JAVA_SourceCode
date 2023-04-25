package javaInput;
import java.util.Scanner;
public class findRemainderwithoutModulus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Divident : ");
        int divident = sc.nextInt();
        System.out.print("Enter Second number : ");
        int divisor = sc.nextInt();
        int quotient = divident/divisor;
        int remainder = divident - (divisor*quotient);
        System.out.println("the remainder is : " + remainder);
        sc.close();
    }
}

//divident  = divisor * quotient + remainder;
//quotient = divident / divisor;
//remainder = divident - (divisor*quotient)
