package bar;

import foo.Foo;

import java.lang.reflect.Field;

/**
 * @author Kohsuke Kawaguchi
 */
public class Bar {
    public static void main(String[] args) throws Exception {
        Field f = Foo.class.getDeclaredField("x");
        f.setAccessible(true);
        Foo pt = new Foo(3, 2);
        System.out.println("x="+f.get(pt));

        Field v = String.class.getDeclaredField("value");
        v.setAccessible(true);
        System.out.println("value="+v.get("foo"));
    }
}
