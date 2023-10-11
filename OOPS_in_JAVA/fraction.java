package OOPS_in_JAVA;


public class fraction {
    // Function to find GCD : 
    public static int gcd(int num, int deno) {
        int min = Math.min(num, deno);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && deno % i == 0)
                return i;
        }
        return min;
    }

    // Function for Addition of fractions :
    public static Fraction addFraction(Fraction f1, Fraction f2) {
        // Fraction f3 = new Fraction();
        // f3.numerator = (f1.numerator * f2.denominator) + (f2.numerator *
        // f1.denominator);
        // f3.denominator = f1.denominator * f2.denominator;
        // f3.simplify();
        // return f3;
        int num = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int deno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(num, deno);
        f3.simplify();
        return f3;
    }

    // Function for Subtraction of fractions :
    public static Fraction subtractFraction(Fraction f1, Fraction f2) {
        int num = ((f1.numerator * f2.denominator) - (f2.numerator * f1.denominator));
        int deno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(num, deno);
        f3.simplify();
        return f3;
    }
    
    // Function for Multiplication of fractions :
    public static Fraction multFraction(Fraction f1, Fraction f2) {
        int num = f1.numerator * f2.numerator;
        int deno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(num, deno);
        f3.simplify();
        return f3;
    }

    // Function for Division of fractions :
    public static Fraction divideFraction(Fraction f1, Fraction f2) {
        int num = f1.numerator * f2.denominator;
        int deno = f1.denominator * f2.numerator;
        Fraction f3 = new Fraction(num, deno);
        f3.simplify();
        return f3;
    }



    // Fraction Class :
    public static class Fraction {
        int numerator;
        int denominator;

        // constructor :
        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        // Simplify function :
        public void simplify() {
            int hcf = gcd(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
        }

    }

    public static void main(String[] args) {
        // Fraction f1 = new Fraction(3, 6);
        // f1.numerator = 3;
        // f1.denominator = 7;
        // System.out.println(f1.numerator + "/" + f1.denominator);

        // Fraction f2 = new Fraction(34, 56);
        // System.out.println("Your fraction : " + f2.numerator + "/" + f2.denominator);
        // f2.simplify();
        // System.out.println("After simplification : " + f2.numerator + "/" +
        // f2.denominator);

        Fraction f1 = new Fraction(5, 7);
        System.out.println("First fraction : " + f1.numerator + "/" + f1.denominator);

        Fraction f2 = new Fraction(3, 5);
        System.out.println("Second fraction : " + f2.numerator + "/" + f2.denominator);

        Fraction f3 = addFraction(f1, f2);
        System.out.println("Addition of fractions : " + f3.numerator + "/" + f3.denominator);

        Fraction f6 = subtractFraction(f1, f2);
        System.out.println("Subtraction of fractions : " + f6.numerator + "/" + f6.denominator);

        Fraction f4 = multFraction(f1, f2);
        System.out.println("Multiplication of fractions : " + f4.numerator + "/" + f4.denominator);

        Fraction f5 = divideFraction(f1, f2);
        System.out.println("Division of fractions : " + f5.numerator + "/" + f5.denominator);
    }
}
