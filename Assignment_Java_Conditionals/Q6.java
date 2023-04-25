package Assignment_Java_Conditionals;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        int per = sc.nextInt();
        if(per > 90){
            System.out.println("Your Grade is: A+");
        }
        else if(per > 80){
            System.out.println("Your Grade is: A");
        }
        else if(per > 70){
            System.out.println("Your Grade is: B+");
        }
        else if(per > 60){
            System.out.println("Your Grade is: B");
        }
        else if(per > 50){
            System.out.println("Your Grade is: C");
        }
        else if(per > 40){
            System.out.println("Your Grade is: D");
        }
        else if(per > 30){
            System.out.println("Your Grade is: E");
        }
        else{
            System.out.println("Your Grade is: F");
        }
        sc.close();
    }
}
