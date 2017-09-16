package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

public class OpenGoogle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("vivegam songs");
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		 /*driver.findElement(By.xpath("//*[@id='rso']/div/div/div[1]/div/div/h3/a")).click();
		 ((JavascriptExecutor)driver).executeScript("window.scrollTo(10,document.body.scrollHeight)");*/
			
		//driver.findElement(By.xpath("//*[@id='rso']/div[3]/div/div[1]/div/div/h3/a")).click();
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("D:\\screenshot.jpg"));*/
		
		driver.findElement(By.xpath("//*[@id='rso']/div/div/div[2]/div/div/h3/a")).click();
		driver.findElement(By.xpath("//*[@id='post-4161']/div/p[5]/a")).click();
		

	}

}

