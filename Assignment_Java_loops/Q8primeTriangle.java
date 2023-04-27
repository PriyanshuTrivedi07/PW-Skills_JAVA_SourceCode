package Assignment_Java_loops;
import java.util.Scanner;
public class Q8primeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int r = sc.nextInt();
        int banner  = 0;
        int number = 3;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print("  ");
            }
            if(i==1){
                System.out.print("2");
            }
            else{
                for(int k = 0;k!=i;){
                    banner = 0;
                    for(int l=2;l<number;l++){
                        if(number%l==0){
                            banner = 1; //not prime
                        }
                    }
                    if(banner ==0){
                        k++;
                        System.out.print(number+" ");
                    }
                    number++;
                }
            }
            System.out.println();
        }
        sc.close(); 
    }
}
