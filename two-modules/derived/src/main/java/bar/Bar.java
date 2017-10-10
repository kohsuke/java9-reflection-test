package bar;

import foo.AccessToSecret;
import foo.Foo;

import java.lang.reflect.Field;

/**
 * @author Kohsuke Kawaguchi
 */
public class Bar {
    public static void main(String[] args) throws Exception {
        try {
            Field f = Foo.class.getDeclaredField("x");
            f.setAccessible(true);
            Foo pt = new Foo(3, 2);
            System.out.println("x="+f.get(pt));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Field msg = AccessToSecret.secret.getClass().getDeclaredField("message");
            msg.setAccessible(true);
            System.out.println("message="+msg.get(AccessToSecret.secret));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Field v = String.class.getDeclaredField("value");
            v.setAccessible(true);
            System.out.println("value="+v.get("foo"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
