// case: j03
package fixtures;

import javax.crypto.KeyGenerator;

public class J03 {
    public KeyGenerator create() throws Exception {
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(256);
        return generator;
    }
}
