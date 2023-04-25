package Conditionals;
import java.util.Scanner;
public class checkTwoDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it is three digit or not : ");
        int n = sc.nextInt();
        if(n>9 && n<100){
            System.out.println("yes , it is a Two digit number");
        }
        else{
            System.out.println("no it's not a Two digit number");
        }
        sc.close();
    }
}
