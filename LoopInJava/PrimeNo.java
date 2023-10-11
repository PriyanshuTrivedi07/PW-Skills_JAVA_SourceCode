package LoopInJava;

//Q:- print all prime numbers from 2 to given number n ;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'n' to print all the prime numbers b/w 2-n : ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int flag = 1;// initially let the no. is prime
            for (int j = 2; j < i; j++) {
                // if the no. is divisble by any number b/w 2 to n-1;
                if (i % j == 0) {
                    flag = 0; // not prime;
                    // System.out.println("Not prime");
                    break; 
                }
            }
            if (flag == 1) { // prime
                System.out.println(i);
                // System.out.println("Prime");
            }
        }
        sc.close();
    }
}
