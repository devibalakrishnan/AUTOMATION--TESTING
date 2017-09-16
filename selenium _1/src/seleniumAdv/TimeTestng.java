package seleniumAdv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TimeTestng {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	@BeforeSuite
	public void openBrowser(){
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();}

	@Test
	public void openGoogle(){
		driver.navigate().to("https://www.google.co.in/");
	}

	@Test
	public void openBing(){
		driver.navigate().to("https://www.bing.com/");
	}

	@AfterSuite
	public void closeBrowser(){
		driver.quit();
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println(totalTime/1000.0+" seconds");









	}
}
