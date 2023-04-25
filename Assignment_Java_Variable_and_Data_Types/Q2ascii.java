package Assignment_Java_Variable_and_Data_Types;

import java.util.Scanner;

public class Q2ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'U';
        int value = (int)ch;
        System.out.println("The ASCII value of 'U' is : "+value);
        sc.close();
    }
}
