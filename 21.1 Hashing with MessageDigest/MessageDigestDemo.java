import java.security.MessageDigest;

public class MessageDigestDemo {

    public static void main(String[] args) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest("My input message".getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02X", b));
        }
        String hexString = sb.toString();

        System.out.println(hexString);
    }
}
