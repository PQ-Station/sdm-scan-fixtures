// case: j05
package fixtures;

import javax.crypto.Cipher;

public class J05 {
    public Cipher create() throws Exception {
        return Cipher.getInstance(J05Config.ALGO);
    }
}
