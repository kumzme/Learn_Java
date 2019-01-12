package Selenium.Action;

public class Action_01 {

    public static void main(String[] args) {
        /*
// Drag and Drop
        IWebElement element = driver.FindElement(By.XPath("//*[@id='project']/p[1]/div/div[2]"));
        Actions move = new Actions(driver);
        move.DragAndDropToOffset(element, 30, 0).Perform();

// How to check if an element is visible
        Assert.IsTrue(driver.FindElement(By.XPath("//*[@id='tve_editor']/div")).Displayed);

// Upload a file
        IWebElement element = driver.FindElement(By.Id("RadUpload1file0"));
        String filePath = @ "D:WebDriver.Series.TestsWebDriver.xml";
        element.SendKeys(filePath);

// Scroll focus to control
        IWebElement link = driver.FindElement(By.PartialLinkText("Previous post"));
        string js = string.Format("window.scroll(0, {0});", link.Location.Y);
        ((IJavaScriptExecutor) driver).ExecuteScript(js);
        link.Click();

// Taking an element screenshot
        IWebElement element = driver.FindElement(By.XPath("//*[@id='tve_editor']/div"));
        var cropArea = new Rectangle(element.Location, element.Size);
        var bitmap = bmpScreen.Clone(cropArea, bmpScreen.PixelFormat);
        bitmap.Save(fileName);

// Focus on a control
        IWebElement link = driver.FindElement(By.PartialLinkText("Previous post"));

// Wait for visibility of an element
        WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(30));
        wait.Until(ExpectedConditions.VisibilityOfAllElementsLocatedBy(
                By.XPath("//*[@id='tve_editor']/div[2]/div[2]/div/div")));

//Basic Elements Operations

        IWebElement element = driver.FindElement(By.Id("id"));
        element.Click();
        element.SendKeys("someText");
        element.Clear();
        element.Submit();
        string innerText = element.Text;
        bool isEnabled = element.Enabled;
        bool isDisplayed = element.Displayed;
        bool isSelected = element.Selected;
        IWebElement element = driver.FindElement(By.Id("id"));
        SelectElement select = new SelectElement(element);
        select.SelectByIndex(1);
        select.SelectByText("Ford");
        select.SelectByValue("ford");
        select.DeselectAll();
        select.DeselectByIndex(1);
        select.DeselectByText("Ford");
        select.DeselectByValue("ford");
        IWebElement selectedOption = select.SelectedOption;
        IList<IWebElement> allSelected = select.AllSelectedOptions;
        bool isMultipleSelect = select.IsMultiple;


*/
    }
}
