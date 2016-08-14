package com.apps.aravinda;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.*;
import java.util.Properties;

/**
 * Created by aravinda on 8/24/15.
 */
public class App {

    public static void main(String[] args) throws IOException {

        Result result = JUnitCore.runClasses(HomePageTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Does the test case scenarios pass ?? " + result.wasSuccessful());
    }

}
