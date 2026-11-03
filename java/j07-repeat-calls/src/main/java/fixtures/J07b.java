// case: j07
package fixtures;

import java.security.MessageDigest;

public class J07b {
    public MessageDigest create() throws Exception {
        return MessageDigest.getInstance("SHA-1");
    }
}
