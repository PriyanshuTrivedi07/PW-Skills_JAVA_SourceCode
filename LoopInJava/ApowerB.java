package LoopInJava;

import java.util.Scanner;

// Q: Given 2 numbers a and b. Find a raise to the power b;
public class ApowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base = sc.nextInt();
        System.out.println("Enter Power : ");
        int power = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans = ans * base;
        }
        System.out.println(base + " raised to the power " + power + " is = " + ans);
        sc.close();
    }
}
