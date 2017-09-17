package seleniumAdv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultClass {

	WebDriver driver;
	@BeforeSuite
	@Parameters("browser")
	public void openingbrowser(String choosenbrowser) {
		if(choosenbrowser.equalsIgnoreCase("Firefox")){
			System.out.println("You have chosen "+ choosenbrowser);
			System.setProperty("webdriver.gecko.driver", "D:/DEVIBALA/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(choosenbrowser.equalsIgnoreCase("chrome")){
			System.out.println("You have chosen "+ choosenbrowser);
			System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");
			driver = new ChromeDriver(); 

		}
	}
	@Test
	public void openGoogle(){
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();}
	@AfterSuite
	public void closingbrowser(){
		driver.close();
	}

}
