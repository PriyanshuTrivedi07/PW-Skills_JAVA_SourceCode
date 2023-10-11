package Strings;
import java.util.*;
public class cwh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Amit is Good";
        // .length() Method
        // int len = name.length();
        // System.out.format("The length of string '%s' is : %d",name,len);
        // System.out.printf("The length of string '%s' is : %d",name,len);

        // String lstring = name.toLowerCase();
        // System.out.println("the string in lower case is : "+lstring);

        // String ustring = name.toUpperCase();
        // System.out.println("the string in lower case is : "+ustring);

        // System.out.println(name.toUpperCase());

        // String nonTrimmedString = "      amit     ";
        // String TrimmedString = nonTrimmedString.trim();
        // System.out.println(TrimmedString);

        // String substring = name.substring(0, 4); //if you don't give endIndex then this will print the string from beginIndex to end
        // System.out.println(substring);

        // String newname = name.replace('m', 'h'); //this method takes two 'char';
        // System.out.println(newname);

        // String newname = name.replace("Amit", "Sumit trivedi"); //this method takes two 'Strings';
        // System.out.println(newname);

        // System.out.println(name.startsWith("a", 0));
        // System.out.println(name.endsWith("d"));

        // System.out.println(name.indexOf("At", 0));
        // System.out.println(name.lastIndexOf('o', 11));
        // System.out.println(name.equals("Amit is Good")); //case sensitive
        System.out.println(name.equalsIgnoreCase("amit is good")); //ignores the case of character


        sc.close();
    }
}
