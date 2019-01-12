//Find element by CSS Selector
//Absolute path
driver.findElement(By.cssSelector(”html>body>div>p>input”));

//Relative Path
driver.findElement(By.cssSelector(”input”));

//Attribute selection
driver.findElement(By.cssSelector(”button[name]”));

driver.findElement(By.cssSelector(”button[name=‚cancel’]”));

driver.findElement(By.cssSelector(”img:not[alt]”));

.Id selection
driver.findElement(By.cssSelector(”#save”));
//Class selection
driver.findElement(By.cssSelector(”.login”));

.Combined selection
driver.findElement(By.cssSelector(”button#save”));
driver.findElement(By.cssSelector(”input.login”));

.First matching child of the specified tag
driver.findElement(By.cssSelector(”div#students:first-child”));

.Nth matching child of the specified tag
driver.findElement(By.cssSelector(”#loginForm:nth-child(3)”));

.First matching enabled tag
driver.findElement(By.cssSelector(”button:enabled”));

--------------------
//Finding element by XPath
   .Absolute path
     driver.findElement(By.xpath(”html/body/p/input”));
   .Relative path
     driver.findElement(By.xpath(”//input”));
    .Attribute selection
     driver.findElement(By.xpath(”//input[@id=’username’]”));
     driver.findElement(By.xpath(”//*[@id=’myId’]”))
 
// Element interrogation    
  element.getText();
  element.getAttribute();
  element.getTagName();
  element.isDisplayed();
  element.isEnabled();
  element.isSelected(); -> checkbox is selected or not
  selectElement.isMultiple(); -> multi select listbox or not
  selectElement.getOptions(); -> listbox select options   
// Click
element.click() – Button – Link – Checkbox – Combobox
//Submit
form.submit() – Form
//Shift + Click
Actions(driver).keyDown(Keys.SHIFT).click(element).keyUp(Keys.SHIFT).build().perform();
  
