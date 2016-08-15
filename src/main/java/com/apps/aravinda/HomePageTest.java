package com.apps.aravinda;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;

/**
 * Created by Aravinda on 12-Aug-16.
 */
public class HomePageTest {

    private static WebDriver webDriver;
    private final static Logger logger = Logger.getLogger(HomePageTest.class);

    @Before
    public void openBrowser() throws IOException {
        logger.warn("OPEN-BROWSER METHOD CALLED ############################");
        Properties prop = new Properties();
        InputStream input;
        File file = new File("conf/path.properties");
        input = new FileInputStream(file);
        prop.load(input);

        File path = new File(prop.getProperty("chromeDriverPath"));
        System.setProperty("webdriver.chrome.driver", path.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.get("https://www.ambitiousaboutautism.org.uk/talk-about-autism");
        try {
            WebElement closePopUp = webDriver.findElement(By.className("smcx-modal-close"));
            closePopUp.click();
        } catch (Exception error) {
            System.out.println("popup was not displayed, continuing the test case..!!");
        }
    }

    @Test
    public void loginTest() {
        try {
            logger.warn("LOGIN TEST ############################");
            WebElement login = webDriver.findElement(By.id("block-system-user-menu"));
            login.click();
            Thread.sleep(1000);
//            You can use a for loop to give different username and passwords
            WebElement userName = webDriver.findElement(By.id("edit-name"));
            userName.sendKeys("userOne");
            WebElement password = webDriver.findElement(By.id("edit-pass"));
            password.sendKeys("password");
            WebElement submit = webDriver.findElement(By.id("edit-submit--2"));
            submit.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void pageNavigationTest() {
        try {
            logger.warn("PAGE NAVIGATION TEST ############################");
            WebElement donate = webDriver.findElement(By.linkText("Donate"));
            donate.click();
            Thread.sleep(2000);
            webDriver.navigate().back();
            Thread.sleep(2000);
            WebElement ourWorkPage = webDriver.findElement(By.linkText("Our work"));
            ourWorkPage.click();
            Thread.sleep(2000);
            webDriver.navigate().back();
            WebElement newsPage = webDriver.findElement(By.linkText("News"));
            newsPage.click();
            Thread.sleep(2000);
            webDriver.navigate().back();
            WebElement aboutUsPage = webDriver.findElement(By.linkText("About us"));
            aboutUsPage.click();
            Thread.sleep(2000);
            webDriver.navigate().back();
            WebElement contactUsPage = webDriver.findElement(By.linkText("Contact us"));
            contactUsPage.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sideMenuTest() throws Exception {
        logger.warn("SIDE MENU TEST ############################");
        WebElement sideMenuOpen = webDriver.findElement(By.linkText("Menu"));
        sideMenuOpen.click();
        Thread.sleep(2000);
        WebElement sideMenuClose = webDriver.findElement(By.linkText("Close"));
        sideMenuClose.click();
        Thread.sleep(2000);
    }

    @Test
    public void OurSchoolCollegeMenuTest() throws Exception {
        logger.warn("OUR SCHOOL & COLLEGE SIDE MENU ASSES TEST ############################");
        WebElement ourSchoolCollegeMenuOpen = webDriver.findElement(By.linkText("Our Schools & College"));
        ourSchoolCollegeMenuOpen.click();
        Thread.sleep(2000);
        WebElement ourSchoolCollegeMenuClose = webDriver.findElement(By.linkText("Close"));
        ourSchoolCollegeMenuClose.click();
        Thread.sleep(2000);
    }

    @Test
    public void searchButton() throws Exception {
        logger.warn("SEARCH TOOL TEST ############################");
        WebElement searchButton = webDriver.findElement(By.className("icon-search"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement searchValue = webDriver.findElement(By.id("edit-search-block-form--2"));
        searchValue.sendKeys("Test Value");
        searchValue.submit();
        Thread.sleep(2000);
    }

    @After
    public void closeTheDrive() {
        logger.warn("TEST CASE WAS DONE... CLOSE THE DRIVER ############################");
        webDriver.quit();
    }

}
