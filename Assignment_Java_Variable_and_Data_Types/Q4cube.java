package Assignment_Java_Variable_and_Data_Types;
import java.util.Scanner;
public class Q4cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's cube :");
        int num = sc.nextInt();
        int cube = num*num*num;
        System.out.println("The Cube of "+num+" is "+cube);
        sc.close();
    }
}
