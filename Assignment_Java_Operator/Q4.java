package Assignment_Java_Operator;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 55;
        int b = 70;
        if (a < 50 && a < b) {
            System.out.println("Print both conditions are True.");
        } else if (a < 50 || a < b) {
            System.out.println("At least one condition is True.");
        }
        sc.close();
    }
}
