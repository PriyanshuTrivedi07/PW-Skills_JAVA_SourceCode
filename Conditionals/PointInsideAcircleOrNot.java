package Conditionals;

import java.util.Scanner;

public class PointInsideAcircleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, r = 3; // (x,y) --> centre of circle , r = radius
        int a = 2, b = 3;// (a,b)--> given points to check where they lies
        int d2 = ((x-a)*(x-a)) + ((y-b)*(y-b)); //distance b/w centre of circle & the given point
        if(d2 > (r*r)){
            System.out.println("Point lies Outside the circle");
        }
        else if(d2 == (r*r)){
            System.out.println("Point lies On the circle");
        }
        else{
            System.out.println("Point lies Inside the circle");
        }
        sc.close();
        
    }
}
