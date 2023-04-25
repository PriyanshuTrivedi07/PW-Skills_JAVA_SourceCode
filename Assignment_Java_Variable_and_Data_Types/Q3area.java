package Assignment_Java_Variable_and_Data_Types;
import java.util.Scanner;
public class Q3area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        double l = sc.nextInt();
        System.out.println("Enter Breadth :");
        double b = sc.nextInt();
        double area = l*b;
        System.out.println("The area of rectangle is "+area);
        sc.close();
    }
}
