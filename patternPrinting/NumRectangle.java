//print this Pattern : for input = 7;
    // 1 2 3 4 5 6 7
    // 2 3 4 5 6 7 1
    // 3 4 5 6 7 1 2
    // 4 5 6 7 1 2 3
    // 5 6 7 1 2 3 4
    // 6 7 1 2 3 4 5
    // 7 1 2 3 4 5 6
package patternPrinting;
import java.util.Scanner;

public class NumRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Row : ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            int a = i;
            for (int j = 1; j <= r; j++) {
                System.out.print(a+" ");
                a++;
                if(a>r){
                    a = 1;
                }

            }
            System.out.print("\n");
        }
        sc.close();
    }
}
