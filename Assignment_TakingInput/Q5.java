package Assignment_TakingInput;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines : ");
        int lines = sc.nextInt();
        for(int i=1;i<=lines;i++){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(s1+s2);
        }
        sc.close();
    }
}
