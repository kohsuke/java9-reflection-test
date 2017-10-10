#!/bin/bash -ex
mvn clean install
mkdir -p mods
cp */target/*.jar mods
$JAVA_HOME/bin/java -p mods -m derived/bar.Bar