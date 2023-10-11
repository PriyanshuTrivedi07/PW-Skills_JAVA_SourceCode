package Strings;

import java.util.*;

public class stringintchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "abc";  
        // str = str + "xyz"; // str += "xyz" ||  str + str
        // str += "R"; // str + char
        // str += 10; // str + int
        // System.out.println(str); 
        String s = "geeks";
        // for(int j=2;j<4;j++){
        //     System.out.print(s.substring(j));
        // }
        int i = 0, j = s.length() - 1;
        while(i < j){
            char temp = s.charAt(i);
            s.replace(s.charAt(i), s.charAt(j));
            s.replace(s.charAt(j), temp);
            i++;
            j--;
        }
        System.out.println(s);

        sc.close();
    }
}
