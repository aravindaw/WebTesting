package com.apps.aravinda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.rzo.yajsw.os.ms.win.w32.WindowsXPMouse;

import java.io.File;

/**
 * Created by Aravinda on 12-Aug-16.
 */
public class HomePageTest {

    private static WebDriver webDriver;

    @Before
    public void openBrowser() {
        File path = new File("src/main/resources/chromedriver.exe");
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
    public void donationTest() {
        try {
            WebElement donate = webDriver.findElement(By.linkText("Donate"));
            donate.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ourWorkPage() {
        try {
            WebElement ourWorkPage = webDriver.findElement(By.linkText("Our work"));
            ourWorkPage.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void newsPage() {
        try {
            WebElement newsPage = webDriver.findElement(By.linkText("News"));
            newsPage.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void aboutUsPage() {
        try {
            WebElement aboutUsPage = webDriver.findElement(By.linkText("About us"));
            aboutUsPage.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contactUsPage() {
        try {
            WebElement contactUsPage = webDriver.findElement(By.linkText("Contact us"));
            contactUsPage.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeTheDrive() {
        webDriver.quit();
        System.out.println("DONE...");
    }

}
