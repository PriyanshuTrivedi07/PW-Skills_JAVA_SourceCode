package NumberSystem;
import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int n = sc.nextInt();
        int nCopy = n;
        int ans = 0;
        int pow = 1;
        while(nCopy>0){
            int lstdigit = nCopy%10;
            ans = ans + lstdigit*pow;
            pow *= 2;
            nCopy = nCopy/10;
        }
        System.out.println("The Decimal conversion of "+n+" is: "+ans);
        sc.close();
    }
}
