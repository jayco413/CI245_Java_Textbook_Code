import java.math.BigInteger;

public class ModPowDemo {

    public static void main(String[] args) {
        BigInteger base = BigInteger.valueOf(5);
        BigInteger power = BigInteger.valueOf(2);
        BigInteger modulus = BigInteger.valueOf(10);
        BigInteger result = base.modPow(power, modulus); // 5^2 mod 10 = 5
        System.out.println(result);
    }
}
