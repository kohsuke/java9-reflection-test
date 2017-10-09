package foo;

/**
 * @author Kohsuke Kawaguchi
 */
public class Foo {
    private int x,y;

    public Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point["+x+","+y+"]";
    }
}
