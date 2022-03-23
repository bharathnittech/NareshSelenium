package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelLocator {
	

//Syntax 1: tagName#id
//Syntax 2: tagName.className
//Syntax 3: tagName[attribute = 'attribute-value']

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
		
//		5. Locate the webelement loginPage header using cssSelector locator
		WebElement loginPageHeader = driver.findElement(By.cssSelector("div#logInPanelHeading"));
		
//		6. Locate the webelement username using cssSelector locator
		WebElement usernameTextbox = driver.findElement(By.cssSelector("input#txtUsername"));
		
//		7. Locate the webelement password using cssSelector locator
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input#txtPassword"));
		
//		8. Locate the webelement login button using class cssSelector locator
		WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
		
//		9. Locate the webelement forgotpasswordLink using cssSelector locator
		WebElement 	forgotpasswordLink = driver.findElement(By.cssSelector("a[href='/index.php/auth/requestPasswordResetCode']"));
		
//		10. Locate the webelement application logo using cssSelector locator 
		WebElement appLogo = driver.findElement(By.cssSelector("img[src='/webres_622c1bfeebcab0.03534043/themes/custom/images/login/logo.png']"));
	}

}
