package Conditionals;
import java.util.Scanner;
public class checkThreeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it is three digit or not : ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("yes , it is a three digit number");
        }
        else{
            System.out.println("no it's not a three digit number");
        }
        sc.close();
    }
}
