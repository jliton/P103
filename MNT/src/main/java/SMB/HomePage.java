package SMB;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {

	
	public WebDriver Driver;
	


	
	@Test
	public static void MNT_Home_Page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// launch application
		driver.get("https://www.weightwatchers.com/us/");
		// verify title
		String title = driver.getTitle();
		Assert.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help");
		System.out.println("Landing Page Title  Verified "+ title);
	
		
//		
//		
		
		
	} // Weekdays

}
	
