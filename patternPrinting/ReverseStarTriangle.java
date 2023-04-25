package patternPrinting;
import java.util.Scanner;
public class ReverseStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Row : ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r+1)-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();        
    }
}
