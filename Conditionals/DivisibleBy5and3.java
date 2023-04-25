package Conditionals;
import java.util.Scanner;
public class DivisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("yes , Divisible by 5 and 3 both");
        }
        else{
            System.out.println("No, Not divisible by 5 and 3");
        }
        sc.close();
        
    }
}
