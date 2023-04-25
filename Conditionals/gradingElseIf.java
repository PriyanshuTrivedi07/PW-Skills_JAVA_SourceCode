package Conditionals;

import java.util.Scanner;

public class gradingElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Percentage : ");
        int per = sc.nextInt();
        if(per > 90){
            System.out.println("You are Excellent");
        }
        else if(per > 80){
            System.out.println("You are Very good");
        }
        else if(per > 70){
            System.out.println("You are Good");
        }
        else if(per > 60){
            System.out.println("You are Can do better");
        }
        else if(per > 50){
            System.out.println("You are Average");
        }
        else if(per > 40){
            System.out.println("You are Below Average");
        }
        else{
            System.out.println("You are Fail");
        }
        sc.close();
    }
}