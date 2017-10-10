#!/bin/bash -ex
mvn clean install
$JAVA_HOME/bin/java -cp target/*.jar bar.Bar