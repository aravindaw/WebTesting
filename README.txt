Requirements
============
Java 1.8
Maven
Linux OS

Pre-Requirements
================
Chrome web Driver
Chromium browser

How to run
==========

Run as a binary wrapper
-----------------------
1.Build the project from room directory
    mvn clean install
2.Set Chrome Webdriver path in {project}/conf/path.properties
3.Run the binary
    ./ambitiousAboutAutismTest start


Run as a Junit test case
------------------------
Open an IDE
Go to {project}/src/main/java/com.apps.aravinda/HomePageTest.java
Run the HomePageTest.java
