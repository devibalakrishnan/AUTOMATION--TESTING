package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("RF question 2016");
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id='rso']/div[3]/div/div[1]/div/div/h3/a")).click();
		
		
		
		
		
		/*WebDriver seleniumDriver = null;
		WebDriver augmentedDriver = new Augmenter().augment(seleniumDriver);
        File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);*/
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("D:\\screenshot.jpg"));
	}

}
