// case: j02
package fixtures;

import java.security.MessageDigest;

public class J02 {
    public MessageDigest create() throws Exception {
        return MessageDigest.getInstance("MD5");
    }
}
