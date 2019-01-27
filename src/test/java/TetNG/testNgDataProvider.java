package TetNG;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class testNgDataProvider {
    public static WebDriver driver;
    public static WebDriverWait wait;
    String appUrl = "https://www.linkedin.com";

    //Locators
    private By byEmail = By.id("login-email");
    private By byPassword = By.id("login-password");
    private By bySubmit = By.id("login-submit");
    private By byError = By.id("error-for-username");

    @Before
    public void testSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    public void verifyLogin(String username, String password) {
        driver.get(appUrl);
        driver.findElement(byEmail).sendKeys(username);
        driver.findElement(byPassword).sendKeys(password);
        elemenetVisiblity();
        driver.findElement(bySubmit).click();
    }

    public void elemenetVisiblity() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySubmit));
    }

}




