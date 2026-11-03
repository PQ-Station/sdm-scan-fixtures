// case: j07
package fixtures;

import java.security.MessageDigest;

public class J07a {
    public MessageDigest first() throws Exception {
        return MessageDigest.getInstance("SHA-1");
    }

    public MessageDigest second() throws Exception {
        return MessageDigest.getInstance("SHA-1");
    }
}
