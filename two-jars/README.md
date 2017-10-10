# Result of Execution
    x=3
    WARNING: An illegal reflective access operation has occurred
    WARNING: Illegal reflective access by bar.Bar (file:/files/kohsuke/ws/experiments/java9/two-jars/derived/target/derived-1.0-SNAPSHOT.jar) to field java.lang.String.value
    WARNING: Please consider reporting this to the maintainers of bar.Bar
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release
    value=[B@17c68925

# Interpretation
The result is the same as "one jar" scenario. Even those `Foo` and `Bar`
now reside in separate jar files, they still belong to "the unnamed module"
that houses everything on classpath.

Private fields of `String` is not accessible to `Bar` because `String`
belongs to the Java RT module that's different from the module of `Bar`