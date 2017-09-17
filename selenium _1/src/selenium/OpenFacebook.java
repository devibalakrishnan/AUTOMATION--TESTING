package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class OpenFacebook {
	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		/*driver.findElement(By.name("email")).sendKeys("devibala246@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("shaliniravi671997...");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("")).sendKeys("shaliniravi671997...");*/
	   // driver.findElement(By.name("xhpc_message")).sendKeys("i love automation testing");
	    //Robot robot= new Robot();
	    //Thread.sleep(5000);
	    
	   /*WebElement postButton= driver.findElement(By.xpath("//button[@type='submit']"));
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", postButton);
	   */
	   
	//    driver.findElement(By.xpath("//*[@id='u_0_15']/div[3]/div/div[2]/div/button")).click();
	    
	   
	  // robot.keyPress(KeyEvent.VK_ENTER);
	 //  robot.keyRelease(KeyEvent.VK_ENTER);
		
	    
	    
		
		
		
		
		 
		 
		 
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
