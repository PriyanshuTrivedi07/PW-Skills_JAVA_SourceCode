package Assignment_JavaMethods;

import java.util.*;

// Q2 - Write a Java method to count all vowels in a string
public class Q2 {
     
    static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;

                default:
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();

        System.out.println("The number of vowels in the given String are : " + countVowels(s));
        sc.close();
    }
}
