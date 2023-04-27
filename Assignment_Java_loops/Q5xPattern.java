package Assignment_Java_loops;

import java.util.Scanner;
//program to print cross pattern (x)
//if input is 5 print like this :-
// *       *
//   *   *
//     *
//   *   *
// *       *
public class Q5xPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a odd no. :");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == j || i+j == r+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
