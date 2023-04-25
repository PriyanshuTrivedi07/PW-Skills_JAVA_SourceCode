package Assignment_Java_Variable_and_Data_Types;
import java.util.Scanner;
public class Q5swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : ");
        System.out.println("a = "+a+" , "+"b = "+b);
        sc.close();
    }
}
