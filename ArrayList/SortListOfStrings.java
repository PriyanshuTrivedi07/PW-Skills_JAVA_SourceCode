package ArrayList;
import java.util.*;
public class SortListOfStrings {
    public static void main(String[] args) {
        // ArrayList<String> l = new ArrayList<>();
        // l.add("Welcome");
        // l.add("To");
        // l.add("Physics");
        // l.add("Wallah");
        // System.out.println("Original list : "+l);
        // Collections.sort(l);
        // System.out.println("Sorted list : "+l);
        // Collections.sort(l, Collections.reverseOrder());
        // System.out.println("Des order : "+l);

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 0 ; i < 5; i++){
            int n = sc.nextInt();
            l1.add(n);
        }
        System.out.println("Your List : "+l1);
        sc.close();
    }
}
