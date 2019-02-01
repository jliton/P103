package PageObject;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MNT_HomePage {

	
	public WebDriver Driver;
	
    

	
	@Test
	public static void MNT_Home_Page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// launch application
		driver.get("https://Google.com");
		// verify title
		  String title = driver.getTitle();
		
		Assert.assertEquals(title, "Google");

		System.out.println("Landing Page Title Validated :- "+ title);
	
	
//		
//		
		
		
	} // Weekdays

}
	
