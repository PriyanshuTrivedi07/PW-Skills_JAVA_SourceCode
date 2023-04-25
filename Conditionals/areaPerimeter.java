package Conditionals;

import java.util.Scanner;

public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        double l = sc.nextDouble(); // length
        System.out.print("Enter Breadth :  ");
        double b = sc.nextDouble(); // breadth
        double area = l * b;
        System.out.println("Area = " + area);
        double peri = 2 * (l + b);
        System.out.println("Perimeter = " + peri);
        if (area > peri) {
            System.out.println("Area is Greater than Perimeter.");
        }
        else if (area == peri){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Perimeter is greater than Area");
        }
        sc.close();
    }
}
