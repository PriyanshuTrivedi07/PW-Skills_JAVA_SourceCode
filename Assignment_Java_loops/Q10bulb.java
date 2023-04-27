package Assignment_Java_loops;
import java.util.Scanner;

public class Q10bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of bulbs : ");
        int n = sc.nextInt(); //no. of bulbs & no. of fluctuation
        System.out.println("The bulbs which are switched On after "+n+" fluctuation are :");
        for(int i=1;i<=n;i++){
            //check if the i is perfect square or not 
            int sr = (int)Math.sqrt(i); //sr ---> squareRoot
            if(sr*sr == i){//print i if it is a perfect square
                System.out.print(i+" ");
                // if(i==1){
                //     System.out.print(i+"st ");
                // } 
                // else{
                //     System.out.print(i+"th ");
                // }
            }
        }
        sc.close();
    }
}
