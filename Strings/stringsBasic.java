package Strings;

import java.util.*;

public class stringsBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "priyanshu Trivedi";
        // System.out.println(name.charAt(5)); //returns the character at given index
        // int idx = name.indexOf('p', 0); //case sensitive
        // System.out.println(idx);

        // String name2 = "triyanshu";
        // System.out.println(name.compareTo(name2));
        // System.out.println(name.compareToIgnoreCase(name2));

        // System.out.println(name.contains(" ")); //csan't take character
        // System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        sc.close();
    }

}
