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

	public static WebDriver driver;

	@Test
	public static void Verfication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// launch application
		driver.get("https://www.weightwatchers.com/");
		// verify title
		String title = driver.getTitle();
		System.out.print(title);
     	Assert.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help");
    	System.out.println("Landing Page Title  Verified " + title);
//		// click on find location
//		
//		Assert.assertEquals(titlematched, true);
//		System.out.println("Find a Studio & Meeting Near You | WW USA" + " Title  Verified ");
//		// print out title from first result and distance
//		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
//		
//		// Print the title of the first result and the distance
		
		
	} // Weekdays

}
	
