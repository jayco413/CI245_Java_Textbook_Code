import javax.crypto.*;
import javax.crypto.spec.*;

public class TripleDesCipher {

    private SecretKey key;
    private IvParameterSpec iv;
    private String transformation;

    public TripleDesCipher(String rawKey) throws Exception {
        transformation = "DESede/CBC/PKCS5Padding";
        DESedeKeySpec keySpec = new DESedeKeySpec(rawKey.getBytes());
        iv = new IvParameterSpec(new byte[8]);
        key = SecretKeyFactory.getInstance("DESede").generateSecret(keySpec);
    }

    public byte[] encrypt(String plaintext) throws Exception {
        Cipher c = Cipher.getInstance(transformation);
        c.init(Cipher.ENCRYPT_MODE, key, iv);
        return c.doFinal(plaintext.getBytes());
    }

    public String decrypt(byte[] ciphertext) throws Exception {
        Cipher c = Cipher.getInstance(transformation);
        c.init(Cipher.DECRYPT_MODE, key, iv);
        return new String(c.doFinal(ciphertext));
    }
}
