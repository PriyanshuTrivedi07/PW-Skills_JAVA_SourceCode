package Assignment_Java_loops;
import java.util.Scanner;
public class Q9primeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Prime Number to check whether it can be expressed as a Sum of Two Prime Number : ");
        int num = sc.nextInt();
        if(isPrime(num) && isPrime(num-2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
