package javaInput;
import java.util.Scanner;
public class areaOfcircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.print("Enter radius : ");
        radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("The area of Circle is : " + area);
        sc.close();
    }
}
