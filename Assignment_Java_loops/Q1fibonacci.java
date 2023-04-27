package Assignment_Java_loops;
import java.util.Scanner;
public class Q1fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Terms you want :");
        int n = sc.nextInt();
        int t1 = 1, t2 = 1,t3; //t1 -- first term, t2 -- second term, t3 -- third term
        System.out.print(t1+" "+t2); //printing first term & second term
        for(int i=3;i<=n;i++){
            t3 = t2+t1;// calculating third term
            System.out.print(" "+t3);
            //change the value of t1 and t2
            t1 = t2;
            t2 = t3;
        }
        sc.close();
    }
}
