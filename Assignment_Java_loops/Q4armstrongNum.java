package Assignment_Java_loops;
import java.util.Scanner;
public class Q4armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            int sum = 0;
            int iCopy = i;
            while(iCopy>0){
                int lstdigit = iCopy%10;
                sum = sum + (lstdigit*lstdigit*lstdigit);
                iCopy = iCopy/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
