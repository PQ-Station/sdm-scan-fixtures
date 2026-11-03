// case: j08
package fixtures;

import javax.crypto.Cipher;

public class J08 {
    static Cipher make(String alg) throws Exception {
        return Cipher.getInstance(alg);
    }

    public Cipher create() throws Exception {
        return make("AES");
    }
}
