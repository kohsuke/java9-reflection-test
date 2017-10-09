package foo;

import foo.impl.Secret;

/**
 * @author Kohsuke Kawaguchi
 */
public class AccessToSecret {
    public static final Object secret = new Secret();
}
