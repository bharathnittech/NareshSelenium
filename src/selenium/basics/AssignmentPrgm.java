
package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentPrgm {

	public static void main(String[] args) {
		// luanching the browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximaize the windows
		driver.manage().window().maximize();

		// delete cookies
		driver.manage().deleteAllCookies();

		// Launch application
		driver.get("https://demoqa.com/automation-practice-form");

		// Update firstname, lastname, email , gender and Mobile number

		WebElement frstNameTextbox = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastNameTextbox = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement emailidTxtbox = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement radioBtnMale = driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement mobileNum = driver.findElement(By.xpath("//input[@id='userNumber']"));

		frstNameTextbox.sendKeys("ABC");
		lastNameTextbox.sendKeys("XYZ");
		emailidTxtbox.sendKeys("abc@xyz.com");
		radioBtnMale.click();
		mobileNum.sendKeys("9999999999");

		// Open Calendar
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		
		//Select month
		WebElement month = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
		Select mnth = new Select(month);
		mnth.selectByVisibleText("December");
		
		//Select Year
		WebElement year = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2022");
		
		//Select Date by using dynamic xpath
		WebElement date = driver.findElement(new AssignmentPrgm().selectDate("December", 2022, 1));
		date.click();
		
		// Click on subject
		WebElement subjectTextBox = driver.findElement(By.xpath("//div[contains(@class,'value-container')]"));
		subjectTextBox.click();
		
		// Select subject using actions class
		Actions action = new Actions(driver);
		action.sendKeys("Eng").build().perform();
		WebElement english = driver.findElement(By.xpath("//div[contains(text(),'English')]"));
		english.click();

		//Select Hobbies CheckBox
		WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[text()='Reading']"));
		if (!hobbiesCheckbox.isSelected())
			hobbiesCheckbox.click();		

		//Update current address
		WebElement addresstxtbox = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		addresstxtbox.sendKeys("Test Address");

		//Click on submit button
		WebElement sumbmitbutton = driver.findElement(By.xpath("//button[@id='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", sumbmitbutton);

		//Close browser
		driver.close();

	}

	public By selectDate(String month, int year, int day) {
		return By.xpath("//div[contains(@aria-label,'" + month + "') and contains(@aria-label,'" + year
				+ "') and text()='" + day + "']");
	}
	
	public By selectOption(String option) {
		return By.xpath("//div[text()='"+option+"']");
	}

}
