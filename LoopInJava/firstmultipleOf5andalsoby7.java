package LoopInJava;

import java.util.Scanner;

public class firstmultipleOf5andalsoby7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5;
        while (true) {
            if (i % 7 == 0) {
                System.out.println("the First Multiple of 5 which is also a multiple of 7 is " + i);
                break;
            }
            i += 5;
        }
        sc.close();
    }
}
