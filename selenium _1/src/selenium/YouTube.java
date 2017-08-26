package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 //driver.get("https://www.google.com/");
		 driver.navigate().to("https://www.youtube.com/");
		 /*driver.navigate().back();
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 */
		 driver.findElement(By.xpath("//*[@id='masthead-search-term']")).sendKeys("selenium");
		 //driver.findElement(By.xpath("//*[@id='search-btn']/span"));
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
		 

	}

}
