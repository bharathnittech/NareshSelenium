package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

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
		
//		5. Locate the webelement loginPage header using xpath locator (Absolute Xpath)
		WebElement loginPageHeader_absolute = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[1]"));
		
//		6. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_1 = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));				
		
//		7. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_2 = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));	
		
//		8. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_3 = driver.findElement(By.xpath("//div[contains(@id,'Heading')]"));				
		
//		9. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_4 = driver.findElement(By.xpath("//div[contains(text(),'Panel')]"));		
		
//		10. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_5 = driver.findElement(By.xpath("//div[starts-with(@id,'logInPanel')]"));				
		
//		11. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_6 = driver.findElement(By.xpath("//div[starts-with(text(),'LOGIN')]"));		
				
//		12. Locate the webelement loginPage header using xpath locator (Relative Xpath)
		WebElement loginPageHeader_relative_7 = driver.findElement(By.xpath("//div[@id='logInPanelHeading' and  text()='LOGIN Panel']"));	


	}

}
