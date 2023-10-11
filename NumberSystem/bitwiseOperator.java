package NumberSystem;
// import java.util.Scanner;
public class bitwiseOperator {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int p = 10 , q = 9;
        System.out.println(p|q);//bitwise OR
        System.out.println(p&q);//bitwise AND
        System.out.println(p^q);//bitwise XOR


        System.out.println(~p);//bitwise Complement
        System.out.println(~q);//bitwise Complement

        System.out.println(p<<1);//leftshift by 1;
        System.out.println(q<<1);//leftshift by 1;

        System.out.println(p>>1);//rightShift by 1;
        System.out.println(q>>1);//rightShift by 1;
    }
}
