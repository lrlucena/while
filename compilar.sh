#!/bin/bash

java -jar ./lib/antlr-4.9.2-complete.jar -package plp.enquanto.parser  ./src/plp/enquanto/parser/Enquanto.g4
javac -cp ./lib/antlr-runtime-4.9.2.jar -d bin ./src/plp/enquanto/parser/*.java ./src/plp/enquanto/*.java
cp ./lib/antlr-runtime-4.9.2.jar while.jar
jar --update --file ./while.jar --main-class plp.enquanto.Principal -C bin plp
