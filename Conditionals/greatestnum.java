package Conditionals;
import java.util.Scanner;
public class greatestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number : ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 > num3 ){
            System.out.println(num1 + " is the greatest number");
        }
        else if(num2 >= num1 && num2 > num3 ){
            System.out.println(num2 + " is the greatest number");
        }
        else if(num3 >= num2 && num3 > num1 ){
            System.out.println(num3 + " is the greatest number");
        }
        else{
            System.out.println("All numbers are equal");
        }
        sc.close();
    }
}
