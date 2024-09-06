package com.shubhamdalal.seleniumproject2.selenium_project2;

import com.shubhamdalal.seleniumproject2.selenium_project2.GoogleHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	
	WebDriver driver;
    GoogleHomePage googleHomePage;

    @BeforeClass
    public void setUp() {
        // Set path to ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        googleHomePage = new GoogleHomePage(driver);
    }
    
    @Test
    public void testGoogleSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Use Page Object methods
        googleHomePage.enterSearchQuery("Selenium WebDriver");
        googleHomePage.clickSearchButton();
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}
