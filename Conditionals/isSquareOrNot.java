package Conditionals;
import java.util.Scanner;
public class isSquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        double l = sc.nextDouble(); // length
        System.out.print("Enter Breadth :  ");
        double b = sc.nextDouble(); // breadth 
        if(l == b){
            System.out.println("It is a square.");
        }
        else{
            System.out.println("Not a square");
        }
        sc.close();
    }
}
