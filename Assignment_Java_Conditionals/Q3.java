package Assignment_Java_Conditionals;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling price : ");
        double sp = sc.nextDouble();
        if(sp > cp){
            System.out.println("Profit = " + (sp - cp) + " Rs");
        }
        else{
            System.out.println("Loss = " + (cp - sp) + " Rs");
        }
        sc.close();
    }
}
