package Assignment_JavaMethods;
// Q1 - Write a Java method to compute the average of three numbers
import java.util.*;
public class Q1 {
    static int avg(int a, int b, int c){
    //    int avg =  (a+b+c)/3;
       return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        System.out.println("The average of these numbers is : "+avg(a, b, c));
        sc.close();
    }
}
