// case: j04
package fixtures;

import javax.crypto.Cipher;

public class J04 {
    private static final String ALGO = "AES/CBC/PKCS5Padding";

    public Cipher create() throws Exception {
        return Cipher.getInstance(ALGO);
    }
}
