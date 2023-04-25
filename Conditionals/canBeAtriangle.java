package Conditionals;
import java.util.Scanner;
public class canBeAtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side of Triangle : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side of Triangle : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side of Triangle : ");
        int c = sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("These sides can form a Triangle");
        }
        else{
            System.out.println("Cannot form a Triangle");
        }
        sc.close();
    }
}
