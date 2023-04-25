package patternPrinting;

import java.util.Scanner;

public class SimpleNumRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Row : ");
        int r = sc.nextInt();
        System.out.println("Enter no. of Column : ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
