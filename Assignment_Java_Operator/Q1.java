package Assignment_Java_Operator;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = (((x + 8) / 3) % 5) * 5;
        System.out.println(ans);
        sc.close();
    }
}
