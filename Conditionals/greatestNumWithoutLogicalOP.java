package Conditionals;
import java.util.Scanner;
public class greatestNumWithoutLogicalOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number : ");
        int num3 = sc.nextInt();
        if(num1 > num2){ //agar num1, num2 se bda hai
            if(num1 > num3){ // and num1 , num3 se bhi bda hai
                System.out.println(num1 +" is largest");
            }
            else{ // --->  num1 ,num2 se to bda hai lekin num3 se chota h
                System.out.println(num3+" is largest");
            }
        }
        else{ //num2 > num1
            if(num2 > num3){
                System.out.println(num2+" is largest");
            }
            else{
                System.out.println(num3+ " is largest");
            }
        }
        sc.close();
    }
}
