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


Run as a Junit test case
------------------------
Open an IDE
Go to {project}/src/main/java/com.apps.aravinda/HomePageTest.java
Run the HomePageTest.java
