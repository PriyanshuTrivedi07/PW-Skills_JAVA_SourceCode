package Assignment_Java_loops;
import java.util.Scanner;
public class Q2streamSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers you want to add and  'q' for quit");
        int n = sc.nextInt();
        int sum = 0;
        while(sc.hasNextInt()){
            n = sc.nextInt();
            if(n>=0){
                sum = sum+n;
            }
            else{
                sum = -1;
                break;
            }
        }
        System.out.println("The sum is : "+ sum);
        sc.close();
    }
}
