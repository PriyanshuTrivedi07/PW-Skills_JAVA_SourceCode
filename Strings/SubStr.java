package Strings;

import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";
        // System.out.println(str.substring(0,4));
        System.out.println("All substrings of are : ");
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
            System.out.println();
        }

        
        sc.close();
    }
}
