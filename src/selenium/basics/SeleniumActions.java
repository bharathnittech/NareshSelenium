package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumActions {

	public static void main(String[] args) {
//		1.  Launch the Browser (Browser = Chrome)
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver	= new ChromeDriver();
		
//		2.  Maximize browser window
		driver.manage().window().maximize();
		
//		3.  Clear cookies from browser
		driver.manage().deleteAllCookies();
		
//		4.  Launch the Application (URL = https://www.google.com/)
		driver.get("https://www.abc.com/");

//		5. Identify webelement
		WebElement element = driver.findElement(By.xpath("//abc"));
		
		element.isDisplayed();
		element.isEnabled();
		element.getAttribute("value");
		element.click();
		element.getAttribute("placeholder");
		element.clear();
		element.sendKeys("text");		
		Select s =new Select(element);
		s.isMultiple();				
		s.selectByIndex(2);
		s.selectByValue("2");
		s.selectByVisibleText("ESS");		
		s.deselectByIndex(2);
		s.deselectByValue("2");
		s.deselectByVisibleText("ESS");
		
		if(!element.isSelected())
			element.click();
		
		element.getAttribute("href");
		
		element.click();
		driver.getCurrentUrl();		
		driver.getTitle();		
		element.getText();
		
		Actions action = new Actions(driver);
		action.click(element).build().perform();
		action.doubleClick(element).build().perform();
		action.contextClick(element).build().perform();
		action.dragAndDrop(element, element).build().perform();
		action.moveToElement(element).build().perform();
		
		action.sendKeys(Keys.chord(Keys.CONTROL.SHIFT+"a")).build().perform();;
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);		
		js.executeScript("arguments[0].click()", element);
		js.executeScript("arguments[0].value='text'", element);
	}

}
