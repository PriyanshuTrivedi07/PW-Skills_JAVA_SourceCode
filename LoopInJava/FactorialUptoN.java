package LoopInJava;
import java.util.Scanner;
// Q:- Print the first n factorial numbers
public class FactorialUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which you want to print factorial :");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            System.out.println("The factorial of "+i+" is "+fact);
        }
        sc.close();
    }
}
