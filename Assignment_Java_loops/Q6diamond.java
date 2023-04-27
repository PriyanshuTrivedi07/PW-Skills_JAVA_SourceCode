package Assignment_Java_loops;

import java.util.Scanner;

public class Q6diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number : ");
        int r = sc.nextInt();

        int t = 1;
        for (int i = 1; i <= 2 * r - 1; i++) {
            int sp;// space
            if (i <= r)
                sp = r - i;
            else
                sp = i - r;
            // loop for spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            // loop to print alphabets
            int ch = 65;
            for (int k = 1; k <= t; k++) {
                System.out.print((char) ch);
                ch++;
            }
            if (i < r)
                t += 2;
            else
                t -= 2;
            System.out.println();
        }
        sc.close();
    }
}
