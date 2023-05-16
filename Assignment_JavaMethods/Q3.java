package Assignment_JavaMethods;

import java.util.*;

// Q3 - Write a Java method to display the middle character of a string.(Easy)
// Note: a) If the length of the string is even there will be two middle characters.
// b) If the length of the string is odd there will be one middle character.
public class Q3 {
    static void middleChars(String s) {
        int slen = s.length(); // length of string 's'
        if (slen % 2 != 0) {
            System.out.println(s.charAt(slen / 2));
        } else {
            System.out.println(s.substring((slen / 2) - 1, (slen / 2) + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.next();
        middleChars(s);
        sc.close();
    }
}