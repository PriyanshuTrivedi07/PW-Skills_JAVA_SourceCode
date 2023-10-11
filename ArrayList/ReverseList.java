package ArrayList;

import java.util.*;
public class ReverseList {
    // Method to reverse an ArrayList
    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            Integer temp = list.get(j); // temp = list[j]
            list.set(j, list.get(i)); // list[j] = list[i]
            list.set(i, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(5);
        System.out.println("Original List : " + list);
        // reverseList(list);
        Collections.reverse(list); // this is the inbuilt method present in the 'collections' class
        System.out.println("Reversed List : " + list);
        Collections.sort(list);
        System.out.println("Ascending Order : "+ list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order : " + list);
    }
}
