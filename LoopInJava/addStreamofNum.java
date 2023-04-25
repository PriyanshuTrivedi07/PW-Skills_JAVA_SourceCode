package LoopInJava;
import java.util.Scanner;
public class addStreamofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers, You want to add (enter '-1' when to quit)");
        int n = sc.nextInt();
        int sum = 0;
        while(n != -1){
            sum = sum+n;
            n = sc.nextInt();
        }
        System.out.println("The sum is : "+ sum);
        sc.close();
        
    }
}
