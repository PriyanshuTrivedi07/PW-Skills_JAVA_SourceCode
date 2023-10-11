package Strings;

public class StringsBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        // String a = " world";
        // int x = 4;
        // name.setCharAt(5, 't');
        // s.append(x); // can append integer
        // s.append(a); // can append integer
        // s.append(0.564); //can append float

        // s.insert(2,1); //we can insert int,float , char,string,double,etc at the given index.
        // s.deleteCharAt(2); //it will delete the character from the given index
        // s.delete(1,3); //it will delete all elements from 1 to 2 (bcz startIndex -- is included & endIndex -- is excluded)
        
        s.reverse();
        System.out.println(s);
    }
}
