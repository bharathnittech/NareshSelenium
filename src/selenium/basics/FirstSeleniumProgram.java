package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
	
//		1.  Launch the Browser (Browser = Chrome)
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver	= new ChromeDriver();
		
//		2.  Maximize browser window
		driver.manage().window().maximize();
		
//		3.  Clear cookies from browser
		driver.manage().deleteAllCookies();
		
//		4.  Launch the Application (URL = https://www.google.com/)
		driver.get("https://www.google.com/");
		
//		5.  Verify application title
		String title = driver.getTitle();
//		Assert.assertEquals(title, "Googl");
		
		if(title.equals("Google")) {
			System.out.println("Exected application is launched");
		}else {
			System.out.println("Error while launching application");
		}
		
//		6.  Refresh/Reload the application
		driver.navigate().refresh();
		
//		7.  Navigate to other application (URL = https://in.search.yahoo.com/)
		driver.navigate().to("https://in.search.yahoo.com/");
		
//		8.  Verify application title
		String newTitle = driver.getTitle();
		
		if(newTitle.equals("Yahoo Search - Web Search")) {
			System.out.println("Exected application is launched");
		}else {
			System.out.println("Error while launching application");
		}		
		
//		9.  Go back to previous site 
		driver.navigate().back();
		
//		10. Move forward to next site
		driver.navigate().forward();
				
//		11. Close the browser window
		driver.close();  // driver.quit(); ==> close multiple windows together
	}

}
