import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        byte[] md5 = MessageDigest.getInstance("MD5").digest(input.getBytes());
        byte[] sha256 = MessageDigest.getInstance("SHA-256").digest(input.getBytes());

        System.out.println();
        System.out.println("    MD5 Hash: " + toHex(md5));
        System.out.println("SHA-256 Hash: " + toHex(sha256));
    }

    private static String toHex(byte[] input) {
        StringBuilder sb = new StringBuilder();
        for (byte b : input) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}
