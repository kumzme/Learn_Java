package Selenium.Action;

public class Action_02 {

    public static void main(String[] args) {
/*
       ///Shift + Click
        Actions(driver).keyDown(Keys.SHIFT).click(element).keyUp(Keys.SHIFT).build().perform();

        //Special Actions
        Actions(driver).moveToElement(element).build().perform();

        Actions(driver).contextClick().build().perform();

        Actions(driver).doubleClick().build().perform();

        Actions(driver).clickAndHold().build().perform();

        Actions(driver).release().build().perform();

//Type text
 element.sendKeys(”string”)-
– Input field
  Clear text :  element.clear()

//Listbox Selection
 new Select(element).selectByIndex(elementCount)
 //Listbox Manipulating Commands
 select[ByIndex, ByVisibleText, ByValue]
 deselect[ByIndex, ByVisibleText, ByValue]
 deselectAll()
//Page Load Timeout
Sets the amount of time to wait for a page load to complete
Global setting of the Webdriver object
Negative value means indefinite wait time

driver.manage().timeouts(). pageLoadTimeout(30, TimeUnit.SECONDS);

//Implicit Wait
Specifies the waiting time for element not immediately visible
Global setting of the Webdriver object
0 by default
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Explicit Wait
Waiting for a certain condition

WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
wait.until(ExpectedConditions.method);

//ExpectedConditions methods
presenceOfElementLocated(By locator)

textToBePresentInElement(WebElement element, java.lang.String text)

titleContains(java.lang.String title)

visibilityOf(WebElement element)

invisibilityOfElementLocated(By locator)

elementToBeSelected(WebElement element)

elementToBeClickable(By locator)

//Window Handling
//Size
driver.manage().window().getSize().getHeight();
driver.manage().window().getSize().getWidth();
driver.manage().window().setSize(Dimension d);
driver.manage().window().maximize();
//Position
driver.manage().window().getPosition()..getX();
driver.manage().window().getPosition()..getY();
driver.manage().window().setPosition(Point p);
//Handles
String windowHandle = driver.getWindowHandle();
Iterator windowIterator = browser.getWindowHandles();
HandlesSwitch To
driver.switchTo().window(windowHandle);
//take Screenshots in Selenium
File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(screenshot, new File(fileSource))


*/
    }
}

