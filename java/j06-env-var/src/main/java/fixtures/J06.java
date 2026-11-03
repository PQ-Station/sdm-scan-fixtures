// case: j06
package fixtures;

import javax.crypto.Cipher;

public class J06 {
    public Cipher create() throws Exception {
        return Cipher.getInstance(System.getenv("SDM_FIXTURE_ALG"));
    }
}
