package ArrayList;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        // Integer i = new Integer(3);
        /*
         * 
         * //wrapper classes
         * Integer i = Integer.valueOf(5);
         * System.out.println(i);
         * Float j = Float.valueOf(4.5f);
         * System.out.println(j);
         */

        /*
         * 
         * // Boolean ArrayList
         * ArrayList<Boolean> l2 = new ArrayList<>();
         * 
         * // Character ArrayList
         * ArrayList<Character> l3 = new ArrayList<>();
         * 
         */

        // integer arraylist
        ArrayList<Integer> l1 = new ArrayList<>();

        // .add(element) -> we can add element using this method
        l1.add(5);
        l1.add(2);
        l1.add(6);
        l1.add(1, 7); // we can also give index at which we want to insert our element

        // get an element at index i -> we can get the value of any index using '
        // .get(index) method '
        System.out.println(l1.get(2)); // 2

        // print ArrayList using for loop
        for (int i = 0; i < l1.size(); i++) { // to find the length/size of arraylist we use .size() method
            System.out.print(l1.get(i) + " "); // 5,7,2,6
        }

        // printing the aray list directly
        System.out.println(l1); // prints the whole list within square brackets ' [] ' [5,7,2,6]

        // modifying element at index i -> .set(index, element) method
        l1.set(1, 100);
        System.out.println(l1); // [5,100,2,6]

        // removing an element from index 'i' -> we can remove an element from given
        // index using .remove() method
        l1.remove(1);
        System.out.println(l1); // [5,2,6]

        // remove an element 'e' itself
        l1.remove(Integer.valueOf(5));
        System.out.println(l1); // [2, 6]

        // checking if an element exists or not  -> using .contains(object) method 
        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);


        // if you don't specify class while declaring ArrayList, you can put anything inside ArrayList
        // ArrayList l = new ArrayList<>();
        // l.add("put");
        // l.add(1);
        // l.add('a');
        // l.add(true);
        // l.add(4.5f);
        // System.out.println(l);
    }
}
