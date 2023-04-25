package Conditionals;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("Yes, Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
        sc.close();
    }
}
