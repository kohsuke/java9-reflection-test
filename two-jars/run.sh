#!/bin/bash -ex
mvn clean install
$JAVA_HOME/bin/java -cp base/target/base-1.0-SNAPSHOT.jar:derived/target/derived-1.0-SNAPSHOT.jar bar.Bar
