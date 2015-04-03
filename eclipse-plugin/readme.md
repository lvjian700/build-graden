#Build Script for Eclipse Plugin Development

##Tools

* maven 3.x
* maven tycho: eclipse plugin development maven plugin
* SWTBot: ui automation test
* jacoco: code coverage

##Setup

    mvn clean install
    mvn integration-test -Pui-test

##Nexus support

1. copy settings.xml to your ~/.m2/ folder.
2. update url

You can find other configuration in pom.xml.

##Code Coverage Report

The jacoco report will generate at __target/jacoco__	
The UnitTest report will generate at __target/__ folder in each test project.    


