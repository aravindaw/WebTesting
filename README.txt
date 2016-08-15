Requirements
============
Java 1.8
Maven
Linux OS
Chrome webDriver


How to run
==========

Run as a binary wrapper
-----------------------
1.Build the project from room directory
    mvn clean install
2.Get the WebPageTest-distribution.zip from {project}/target
3.Unzip WebPageTest-distribution.zip
4.Set Chrome Webdriver path in {project}/conf/path.properties
5.Run the binary
    ./ambitiousAboutAutismTest start
6.Check {project}WebPageTest/logs/WebTest.log for more info

Run as a Junit test case from the source code
---------------------------------------------
Configuration need to do
  1)change the path.property file location from "File file = new File("conf/path.properties");"
    This need to change as "File file = new File("src/main/properties/path.properties");"
  2)Change the chromeDriverPath path in path.property

1.Open an IDE
2.Go to {project}/src/main/java/com.apps.aravinda/HomePageTest.java
3.Run the HomePageTest.java as a junit test run


