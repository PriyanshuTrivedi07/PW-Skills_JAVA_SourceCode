package Assignment_Java_Operator;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Three digit's number : ");
        int num = sc.nextInt();
        int copyNum = num;
        int digitsSum = 0;
        while (copyNum > 0) {
            int lastDigit = copyNum % 10;
            digitsSum = digitsSum + lastDigit;
            copyNum = copyNum / 10;
        }
        System.out.println("The sum of digits of " + num + " is = " + digitsSum);
        sc.close();
    }
}
