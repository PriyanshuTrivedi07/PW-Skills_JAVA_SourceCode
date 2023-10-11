package NumberSystem;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number : ");
        int n = sc.nextInt();
        int nCopy = n;
        int ans = 0; // converted Binary number 
        int pow = 1; // representing power of 10
        while (nCopy > 0) {
            int parity = nCopy % 2;
            ans = ans + parity*pow;
            pow *= 10;// increasing the power of 10 by 1 each time
            nCopy = nCopy / 2;
        }
        System.out.println("The Binary conversion of " + n + " is: " + ans);
        sc.close();
    }
}
