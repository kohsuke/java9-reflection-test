# Result of Execution
    x=3
    WARNING: An illegal reflective access operation has occurred
    WARNING: Illegal reflective access by bar.Bar (file:/files/kohsuke/ws/experiments/java9/one-jar/target/java9-reflection-test-1.0-SNAPSHOT.jar) to field java.lang.String.value
    WARNING: Please consider reporting this to the maintainers of bar.Bar
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release
    value=[B@39ba5a14

# Interpretation
private fields of `Foo` is accessible to `Bar` because they both belong to
"the unnamed module" that houses everything in classpath.

But private fields of `String` is not accessible to `Bar` because `String`
belongs to the Java RT module that's different from the module of `Bar`