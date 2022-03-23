package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstAutomationTestcase {

	static WebDriver driver = null;

	public static void main(String[] args)  {
//		1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

//		2. Maximize the Browser window
		driver.manage().window().maximize();

//		3. Launch the Application  { URL = https://opensource-demo.orangehrmlive.com/ }
		driver.get("https://opensource-demo.orangehrmlive.com/");

//		4. Verify Application Login Page title { Expected Result =OrangeHRM }
		String actualTitle = driver.getTitle();
		if (actualTitle.equals("OrangeHRM"))
			System.out.println("Title is matching");
		else
			System.out.println("Title is not matching");

//		5. Verify Login Page Header Text  { Expected Header = LOGIN Panel }
		WebElement loginPageHeader = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		String actalHeader = loginPageHeader.getText();
		if (actalHeader.equals("LOGIN Panel"))
			System.out.println("Loginpage Header is matching");
		else
			System.out.println("Loginpage Header is not matching");
		
//		6. Verify Username and Password text boxes
		WebElement usernameTxtbox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement passwordTxtbox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		if(usernameTxtbox.isDisplayed() && usernameTxtbox.isEnabled() && passwordTxtbox.isDisplayed() && passwordTxtbox.isEnabled())
			System.out.println("Username and Password textboxes are working");
		else
			System.out.println("Username and Password textboxes are not working");
		
//		7. Enter Username and Password  {admin , admin123 }
		usernameTxtbox.clear();
		usernameTxtbox.sendKeys("admin");
		
		passwordTxtbox.clear();
		passwordTxtbox.sendKeys("admin123");		
		
//		8. Click on Sign-In Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();
		
		// Wait for 10 sec
//		Thread.sleep(10000);  //Java Wait - needs to declare throws declaration
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//td[contains(text(),'Marketing')]"), 0));
				
//		9. Click on Admin Menu Button
		WebElement adminMenu= driver.findElement(By.xpath("//b[text()='Admin']"));
		adminMenu.click();
		
//		10. Select option from User Role Dropdown { ESS }
		WebElement userRoleDropdown = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		Select s = new Select(userRoleDropdown);
		s.selectByVisibleText("ESS");
		
//		11. Select All Users Checkbox
		WebElement selectAllChkb = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']"));
		if(!selectAllChkb.isSelected())
			selectAllChkb.click();
		
//		12. Print all values from the Web Table		
		List<WebElement> rows =driver.findElements(By.xpath("//tr[@class]"));
		int totalRows = rows.size();
		System.out.println("Total Rows : "+totalRows);
		
		List<WebElement> columns = driver.findElements(By.xpath("//th[@rowspan='1']"));
		int totalColumns = columns.size();
		System.out.println("Total Columns : "+totalColumns);
		
		//Print column headers
		for (int i=0 ; i<totalColumns ; i++) {
			System.out.println("Column "+(i+1)+" is : "+ columns.get(i).getText());
		}
		
		//Print all the values
		List<WebElement> values = driver.findElements(By.xpath("//td[@class='left']"));		
		for (int j=0 ; j<values.size() ; j++) {
			System.out.println(values.get(j).getText());
		}
		
		//print all values using dynamic xpath
		for (int row=1; row <=totalRows ; row++) {
			for(int col=1; col<=totalColumns;col++) {
				WebElement element = driver.findElement(new FirstAutomationTestcase().getLocator(row,col));
			}
		}
		
//		System.out.println(driver.findElement(new FirstAutomationTestcase().getLocator(10,3)).getText());
		
//		12. Navigate to Workshifts Url  { URL = https://opensource-demo.orangehrmlive.com/index.php/admin/workShift }
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/workShift");
		
//		13. Click on 'Add' shift button
		WebElement addBtn = driver.findElement(By.xpath("//input[@id='btnAdd']"));
		addBtn.click();
		
//		14. Select Multiple Employees from Available Employees Multi-Select Dropdown
		WebElement employeesDrp = driver.findElement(By.xpath("//select[@id='workShift_availableEmp']"));
		Select sel = new Select(employeesDrp);
		if(sel.isMultiple()) {
			sel.selectByIndex(0);
			sel.selectByValue("2");
			sel.selectByVisibleText("Kallyani Bhute");
			
			sel.deselectByIndex(0);
			sel.deselectByValue("2");
			sel.deselectByVisibleText("Kallyani Bhute");
			
		}
		
//		15. Click on My Info Menu Button
		WebElement myInfoMenu = driver.findElement(By.xpath("//b[text()='My Info']"));
		myInfoMenu.click();
		
//		16. Click on 'Edit' Personal Details Button
		WebElement editBtn = driver.findElement(By.xpath("//input[@id='btnSave']"));
		editBtn.click();
		
//		17. Select gender as 'Female' 
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//label[text()='Female']"));
		femaleRadioBtn.click();
		
//		18. Navigate to Google Page  { URL = https://google.com/ }
		driver.navigate().to("https://google.com/");
		
//		19. Verify Google 'Images' Link { Expected Link = https://www.google.co.in/imghp?hl=en&ogbl}
		String ExpectedLink ="https://www.google.co.in/imghp?hl=en&ogbl";
		WebElement imagesLink = driver.findElement(By.xpath("//a[text()='Images']"));
		if(imagesLink.getAttribute("href").equalsIgnoreCase(ExpectedLink)) {
			System.out.println("Link is valid");
		}else {
			System.out.println("Link is not valid");
		}
	
//		20. Close Bowser
		driver.close();
	}
	
	public By getLocator(int rowNum , int columnNum) {
		return By.xpath("//tbody/child::tr["+rowNum+"]/child::td["+columnNum+"]");
	}

}
