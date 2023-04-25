package patternPrinting;
import java.util.Scanner;
public class NumPyramidMast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Row : ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            int a = i-1;
            for(int l=1;l<=i-1;l++){
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
        sc.close(); 
    }
}
