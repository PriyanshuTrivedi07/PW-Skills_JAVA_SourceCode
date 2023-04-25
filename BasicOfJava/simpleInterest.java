package BasicOfJava;

public class simpleInterest {
    public static void main(String[] args) {
        double p,r,t,si;
        p = 100; //principle
        r = 10; // rate
        t = 2; //time
        si = (p*r*t)/100; //simple interest
        System.out.println("The simple interest is "+si);
    }
}
