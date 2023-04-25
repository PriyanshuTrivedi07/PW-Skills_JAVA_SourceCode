package LoopInJava;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its digits : ");
        int num = sc.nextInt();
        int numOfDigits = 0;
        while (num != 0) {
            numOfDigits++;
            num = num / 10;
        }
        System.out.println("the no. of digits are : " + numOfDigits);
        sc.close();

    }
}
