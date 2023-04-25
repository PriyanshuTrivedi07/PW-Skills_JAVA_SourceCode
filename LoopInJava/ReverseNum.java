package LoopInJava;
import java.util.Scanner;
// Q:- Reverse the digit of a given Number ;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int copyNum = num;
        int revNum = 0;
        
        while(copyNum>0){
            int lastDigit = copyNum%10;
            revNum = revNum*10+lastDigit;
            copyNum = copyNum/10;
        }
        System.out.println("The reverse of "+num+" is "+ revNum);
        sc.close();
    }
}
