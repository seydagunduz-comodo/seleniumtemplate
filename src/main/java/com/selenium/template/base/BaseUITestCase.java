package com.selenium.template.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseUITestCase {

    public final static String MAIN_PAGE_URL = "https://www.google.com.tr";

    protected static WebDriver driver = null;

    public void beforeMethod() {
        /* For Firefox
        System.setProperty("webdriver.gecko.driver","./src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver(); */

        // For Chrome
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }


    public void afterMethod() {
        driver.quit();
    }

}



