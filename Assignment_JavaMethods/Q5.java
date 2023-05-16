package Assignment_JavaMethods;

// Q4 - Write a Java method to find the smallest number among three numbers.
import java.util.*;

public class Q5 {
    static int smallestNum(int a, int b, int c) {
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();
        System.out.println(smallestNum(a, b, c));
        
        sc.close();
    }

}
