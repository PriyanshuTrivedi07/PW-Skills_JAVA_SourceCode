package Conditionals;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get absolute value : ");
        int n = sc.nextInt();
        //Method 1 : 👇🏻
        // if(n < 0){
        //     System.out.println("the absolute value of " + n + " is " + -(n));
        // }
        // else{
        //     System.out.println("the absolute value of " + n + " is " + n);
        // }

        //Method 2 : 👇🏻
        if(n < 0){ 
            n = n * (-1);
        }
        System.out.println("the absolute value is : " + n);

        sc.close();
    }
}
