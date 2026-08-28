import java.util.Scanner;

public class RationalTestProgram {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a numerator and denominator: ");
        int n = input.nextInt();
        int d = input.nextInt();

        Rational r1 = new Rational(n, d);
        System.out.println("Testing constructor (n,d): R1 = " + r1.toString());

        Rational r2 = new Rational(n);
        System.out.println("Testing constructor (n): R2 = " + r2.toString());
        System.out.println();

        System.out.println("Testing getNumerator() on R1: " + r1.getNumerator());
        System.out.println("Testing getDenominator() on R1: " + r1.getDenominator());
        System.out.println("Testing getNumerator() on R2: " + r2.getNumerator());
        System.out.println("Testing getDenominator() on R2: " + r2.getDenominator());
        System.out.println();

        System.out.println("Testing getDecimalValue() on R1: " + r1.getDecimalValue());
        System.out.println("Testing getDecimalValue() on R2: " + r2.getDecimalValue());
        System.out.println();

        System.out.print("Enter new numerator: ");
        int newn = input.nextInt();
        r1.setNumerator(newn);
        System.out.println("Testing setNumerator() on R1: " + r1.toString());
        System.out.println();

        System.out.print("Enter new denominator: ");
        int newd = input.nextInt();
        r2.setDenominator(newd);
        System.out.println("Testing setDenominator() on R2: " + r2.toString());
        System.out.println();

        System.out.print("Enter new numerator and denominator: ");
        newn = input.nextInt();
        newd = input.nextInt();
        r1.setFraction(newn, newd);
        System.out.println("Testing setFraction() on R1: " + r1.toString());

        System.out.println("R1 equals R2: " + r1.equals(r2));
        System.out.println("R1 * R2 = " + r1.multiply(r2));
        System.out.println("R2 reciprocal: " + r2.reciprocal());
        System.out.println("R1 / R2 = " + r1.divide(r2));
        System.out.println("R1 + R2 = " + r1.add(r2));
        System.out.println("R2 negated: " + r2.negate());
        System.out.println("R1 - R2 = " + r1.subtract(r2));
        System.out.println("R1 ^ R2 = " + r1.pow(r2));
    }
}
