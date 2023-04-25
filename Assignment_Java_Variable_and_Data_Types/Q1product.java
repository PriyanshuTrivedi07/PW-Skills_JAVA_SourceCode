package Assignment_Java_Variable_and_Data_Types;
import java.util.Scanner;
public class Q1product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x :");
        int x = sc.nextInt();
        System.out.println("Enter y :");
        int y = sc.nextInt();
        int prod = x*y;
        System.out.println(x+" X "+y+" = "+prod);
        sc.close();
    }
}
