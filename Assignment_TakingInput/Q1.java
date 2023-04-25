package Assignment_TakingInput;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String lname = sc.next();
        int roll_no = sc.nextInt();
        String interest = sc.next();
        System.out.println("Name: "+fname+" "+lname);
        System.out.println("Roll Number: "+roll_no);
        System.out.println("Field of interest: "+interest);
        sc.close();
    }
}
