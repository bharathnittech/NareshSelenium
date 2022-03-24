package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {

		// 1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. Maximize the Browser window
		driver.manage().window().maximize();

		// 3. Launch the Application { URL = https://demoqa.com/automation-practice-form
		driver.get("https://demoqa.com/automation-practice-form");

		// 4.Name Text Box
		WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstNameTextBox.clear();
		lastNameTextBox.clear();

		firstNameTextBox.sendKeys("Sanju");
		lastNameTextBox.sendKeys("G");

		// 5.Email TextBox
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailTextBox.clear();
		emailTextBox.sendKeys("sanju.g@gamil.com");

		// 6.Select gender Male
		WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']"));
		genderMale.click();

		// 7.Find mobile Number Text box
		WebElement mobileTextBox = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		mobileTextBox.sendKeys("1234567890");

		// 8.DOB multiple dropdown(Doubt is in this point=ask to sir)

		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();

		WebElement month = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
		Select mnth = new Select(month);
		mnth.selectByVisibleText("December");
		WebElement year = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2022");

		WebElement date = driver.findElement(new Assignment().selectDate("December", 2022, 1));
		;
		date.click();

		// 9.Select subjectTextBox
		WebElement subjectTextBox = driver.findElement(By.xpath("//div[contains(@class,'value-container')]"));
		subjectTextBox.click();

		Actions action = new Actions(driver);
		action.sendKeys("Eng").build().perform();

		WebElement english = driver.findElement(By.xpath("//div[contains(text(),'English')]"));
		english.click();

		// 10.Select from Hobbies CheckBox
		WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[text()='Reading']"));
		if (!hobbiesCheckbox.isSelected())
			hobbiesCheckbox.click();

		driver.close();
	}

	public By selectDate(String month, int year, int day) {
		return By.xpath("//div[contains(@aria-label,'" + month + "') and contains(@aria-label,'" + year
				+ "') and text()='" + day + "']");
	}

}