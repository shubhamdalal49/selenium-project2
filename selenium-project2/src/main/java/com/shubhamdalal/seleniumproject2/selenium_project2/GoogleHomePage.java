package com.shubhamdalal.seleniumproject2.selenium_project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
    private WebDriver driver;
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchQuery(String query) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(query);
    }

    public void clickSearchButton() {
        WebElement searchBtn = driver.findElement(searchButton);
        searchBtn.click();
    }
}
