package seleniumAdv;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		driver.manage().window().maximize();
		}
	
	
	
	
	@AfterSuite
	public void closingbrowser(){
		
		{
			 driver.get("file:///C:/Users/Admin/git/AUTOMATION--TESTING/selenium%20_1/test-output/index.html#");
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// Now you can do whatever you need to do with it, for example copy somewhere
				try {
					FileUtils.copyFile(scrFile, new File("D:\\screenshot.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					driver.close();
				}
	}

	}}
