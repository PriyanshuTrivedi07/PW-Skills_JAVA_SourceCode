package LoopInJava;

import java.util.Scanner;

// Q:- Find the sum of following Series :---> S = 1 - 2 + 3 - 4 + 5....... n
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last digit : ");
        int num = sc.nextInt();
        int ans = 0;
        // int evensum = 0,oddsum = 0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                ans = ans + i;
            }
            else{
                ans = ans - i;
            }
        }
        // int ans = oddsum - evensum;
        System.out.println("The sum of given series is "+ans);
        sc.close();
    }
}
