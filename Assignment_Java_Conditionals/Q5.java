package Assignment_Java_Conditionals;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (ch) {
            case '+':
                System.out.println(a+" + "+b +" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b +" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" X "+b +" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b +" = "+(a/b));
                break;
            default:
                System.out.println("Invalid Operator :(");
        }
        sc.close();
    }
}
