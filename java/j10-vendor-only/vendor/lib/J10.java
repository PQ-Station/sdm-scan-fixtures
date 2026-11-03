// case: j10
package fixtures;

import java.security.MessageDigest;

public class J10 {
    public MessageDigest create() throws Exception {
        return MessageDigest.getInstance("MD5");
    }
}
