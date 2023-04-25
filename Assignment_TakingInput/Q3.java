package Assignment_TakingInput;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int totalMarks = marks1+marks2+marks3;
        int perc = totalMarks/3;
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Percentage marks: "+perc+"%");
        sc.close();
    }
}
