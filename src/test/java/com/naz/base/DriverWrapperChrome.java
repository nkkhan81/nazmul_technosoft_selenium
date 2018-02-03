package com.naz.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by nkkhan on 1/24/18.
 */
public class DriverWrapperChrome {
    private static WebDriver chromeDriver;
    private static String url = "https://www.facebook.com/";
    private static String hoverOver1 ="https://www.amazon.com/";
    private static String dateExample = "https://www.hotels.com/";
    private static String autoComplete = "https://www.expedia.com/";
    private static String hoverOver2 = "https://www.dhtmlx.com/";
    private static String hoverOver3 = "https://www.target.com/";
    private static String alert = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
    private static String darkSky = "https://darksky.net/";
    private static String classTest = "file:///Users/nkkhan/Projects/technoSoft/javaProjects/seleniumFramework/index.html";

    public static WebDriver getChromeDriver() {
        return chromeDriver;
    }

    public static String getUrl() {
        return alert;
    }

    public static String getAlert() {
        return alert;
    }

    @BeforeClass
    public void driverInitialization(){
        System.setProperty("webdriver.chrome.driver","/Users/nkkhan/Projects/technoSoft/webDrivers/chromedriver");
        this.chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to(classTest);
    }

    @AfterClass
    public void tearDown(){
        chromeDriver.quit();
    }
}
