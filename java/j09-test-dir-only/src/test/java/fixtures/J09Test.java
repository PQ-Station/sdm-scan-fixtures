// case: j09
package fixtures;

import java.security.MessageDigest;

public class J09Test {
    public MessageDigest create() throws Exception {
        return MessageDigest.getInstance("MD5");
    }
}
