package DesignPatterns.Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton_01 {
    private static Singleton_01 instance = null;
    private WebDriver driver;


    private void SingletonExampleWebdriverInstance() {

    }

    public WebDriver openBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static Singleton_01 getInstance() {
        if (instance == null) {
            instance = new Singleton_01();
        }
        return instance;
    }

}
