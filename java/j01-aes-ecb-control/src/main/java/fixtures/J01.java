// case: j01
package fixtures;

import javax.crypto.Cipher;

public class J01 {
    public Cipher create() throws Exception {
        return Cipher.getInstance("AES/ECB/PKCS5Padding");
    }
}
