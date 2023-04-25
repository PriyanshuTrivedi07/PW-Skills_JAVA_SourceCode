package LoopInJava;

import java.util.Scanner;

public class labelsInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myloop: for(int i=1;i<=50;i++){
            if(i%3==0) {
                continue myloop;
            } 
            System.out.println(i);
        }
        sc.close();

    }
}
