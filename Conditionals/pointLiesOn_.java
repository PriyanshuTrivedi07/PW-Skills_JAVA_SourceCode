package Conditionals;
import java.util.Scanner;
public class pointLiesOn_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate");
        int x = sc.nextInt();
        System.out.println("Enter y-coordinate");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("The point lies on origin");
        }
        else if(x==0){
            System.out.println("the point lies on y-axis");
        }
        else if(y==0){
            System.out.println("The point lies on x-axis");
        }
        else{
            System.out.println("The given point neither lies on x-axis nor on y-axis");
        }

        sc.close();
    }
}
