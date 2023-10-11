package Strings;

public class equalsMethod {
    public static void main(String[] args) {
        String s = "hello";
        String z = "hello";
        String x = new String("hello");
        System.out.println(s == z); //this return true bcz the address of both strings are equal
        System.out.println(s == x); //this will return false although the strings are equal but bcz the address of these two string are different
        //so we should always use .equals() method to compare two strings : 
        System.out.println(s.equals(x)); //true
        System.out.println(z.equals(s)); //true
    }
}
