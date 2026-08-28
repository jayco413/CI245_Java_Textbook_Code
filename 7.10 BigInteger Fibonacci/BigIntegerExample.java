import java.math.BigInteger;

public class BigIntegerExample {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("9876543210987654321");

        System.out.println(a.add(b));      // 22222222112222222211
        System.out.println(a.subtract(b)); // 2469135690246913569
        System.out.println(a.multiply(b));
        // 121932631137021795223746380111126352690
        System.out.println(a.divide(b));   // 1
        System.out.println(a.mod(b));      // 2469135690246913569

        BigInteger c = new BigInteger("1111111111111111111");
        BigInteger result = a.add(b).subtract(c).multiply(c).divide(b).mod(a);
        System.out.println(result); // 2374999987357812499

        System.out.println(BigInteger.ZERO); // 0
        System.out.println(BigInteger.ONE);  // 1
        System.out.println(BigInteger.TEN);  // 10

        BigInteger x = new BigInteger("12345678901234567890");
        BigInteger y = new BigInteger("12345678901234567890");
        BigInteger z = new BigInteger("9876543210987654321");
        System.out.println("Is x equal to y? " + x.equals(y)); // true
        System.out.println("Is x equal to z? " + x.equals(z)); // false
    }
}
