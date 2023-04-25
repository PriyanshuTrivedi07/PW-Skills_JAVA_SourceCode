package Assignment_Java_Conditionals;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int x = sc.nextInt();
        if(x>=0){
            System.out.println("The number you entered is: "+x);
        }else{
            System.out.println("The number is negative and skipped");
        }
        sc.close();
    }
}
