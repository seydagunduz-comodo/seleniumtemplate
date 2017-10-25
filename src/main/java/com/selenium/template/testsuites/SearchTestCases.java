package com.selenium.template.testsuites;

import com.selenium.template.base.BaseUITestCase;
import com.selenium.template.componentobjects.ComponentOne;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class SearchTestCases extends BaseUITestCase {

    ComponentOne componentOne;

    @Before
    public void beforeMethod() {
        super.beforeMethod();
        driver.get(MAIN_PAGE_URL);

        componentOne = PageFactory.initElements(driver, ComponentOne.class);
    }

    @Test
    public void test1(){
        componentOne.enterTextSearchBar("abc123");
    }

    @Test
    public void test2(){
        componentOne.enterTextSearchBar("text123");
        System.out.println("test2");
    }

    @After
    public void afterMethod(){
        super.afterMethod();
    }

}
