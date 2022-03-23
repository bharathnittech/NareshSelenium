package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
//		1. Launch the chrome browser 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		2. Maximize browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Launch the application {URL=https://opensource-demo.orangehrmlive.com/}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		5. Locate the webelement loginPage header using id locator
		WebElement loginPageHeader = driver.findElement(By.id("logInPanelHeading"));
		
//		6. Locate the webelement username using name locator
		WebElement usernameTextbox = driver.findElement(By.name("txtUsername"));
		
//		7. Locate the webelement password using name locator
		WebElement passwordTextbox = driver.findElement(By.name("txtPassword"));
		
//		8. Locate the webelement login button using class name locator
		WebElement loginButton = driver.findElement(By.className("button"));
		
//		9. Locate the webelement forgotpasswordLink using linkText locator
		WebElement 	forgotpasswordLink = driver.findElement(By.linkText("Forgot your password?"));
		
//		10. Locate the webelement forgotpasswordLink using partial linkText locator
		WebElement forgotpasswordLink_partial = driver.findElement(By.partialLinkText("Forgot your"));
		
//		11. Locate the webelement application logo using tagName locator 
		WebElement appLogo = driver.findElement(By.tagName("img"));

	}

}
