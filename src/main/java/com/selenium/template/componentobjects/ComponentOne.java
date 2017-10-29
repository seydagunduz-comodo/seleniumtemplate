package com.selenium.template.componentobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentOne {

    final WebDriver driver;
    public ComponentOne(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "lst-ib")
    private WebElement searchBar;


    public void enterTextSearchBar(String text){
        searchBar.click();
        searchBar.sendKeys(text);
    }


}
