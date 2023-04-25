package Conditionals;
import java.util.Scanner;
public class checkForStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=1,y1=1 , x2=2,y2=2 , x3=3,y3=3; //coordinates 
        //Slopes 
        int slope_m1 = (y2-y1)/(x2-x1); 
        int slope_m2 = (y3-y2)/(x3-x2);
        if(slope_m1 == slope_m2){
            System.out.println("These points lies on Staight line.");
        }
        else{
            System.out.println("These points doesn't lies on Staight line.");
        }
        sc.close();
    }
}
