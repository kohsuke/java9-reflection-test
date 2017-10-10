# Result of Execution
    java.lang.reflect.InaccessibleObjectException: Unable to make field private int foo.Foo.x accessible: module base does not "opens foo" to module derived
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:337)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:281)
        at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:176)
        at java.base/java.lang.reflect.Field.setAccessible(Field.java:170)
        at derived/bar.Main.main(Main.java:15)
    java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.lang.String foo.impl.Secret.message accessible: module base does not "opens foo.impl" to module derived
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:337)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:281)
        at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:176)
        at java.base/java.lang.reflect.Field.setAccessible(Field.java:170)
        at derived/bar.Main.main(Main.java:24)
    java.lang.reflect.InaccessibleObjectException: Unable to make field private final byte[] java.lang.String.value accessible: module java.base does not "opens java.lang" to module derived
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:337)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:281)
        at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:176)
        at java.base/java.lang.reflect.Field.setAccessible(Field.java:170)
        at derived/bar.Main.main(Main.java:32)

# Interpretation
private fields of `Foo` is now not accessible to `Bar` because they belong
to separate modules. This is regardless of whether a class belongs to an
exported package or not (see `Foo` vs `Secret`)

Private fields of `String` is not accessible to `Bar` because `String`
belongs to the Java RT module that's different from the module of `Bar`